package com.imooc.proxy;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.commons.io.FileUtils;

public class Proxy {
	public static Object newProxyInstance(Class infce,InvocationHandler h) throws Exception {
		String rt = "\r\n";
		String methodStr = "";
		for (Method m : infce.getMethods()) {
			methodStr += " 	@Override"
					+ rt
					+ "	public void "
					+ m.getName()
					+ "() {"
					+ rt
					+ " 		m."
					+ m.getName()
					+ "();"
					+ "Method md = " + infce.getName() + ".class.getMethod(\""  
	                    + m.getName() + "\");" + rt +  
	                    "h.invoke(this, md);" + rt +  
	                    "}catch(Exception e) {e.printStackTrace();}" + rt +  
	                    "}";  
		}
		String str = " package com.imooc.proxy;" + rt
				+"import com.imooc.proxy.invocationHandler"+rt
				+"import java.lang.reflect.Method;" + rt   
				+ " public class $Proxy0 implements " + infce.getName()
				+ "	public Proxy0(invocationHandler h) {" + rt
				+"h.invoke(this)"+ rt
				+ " 		super();" + rt + " 		this.h = h;" + rt + " 	}" + rt
				+ methodStr;

		// 产生代理类得java文件
		String filename = System.getProperty("user.dir")
				+ "/bin/com/imooc/proxy/$Proxy0.java";
		System.out.println(filename);
		File file = new File(filename);
		 FileUtils.writeStringToFile(file, str);
		// 编译
		// 拿到编译器
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		// 文件管理者
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(
				null, null, null);
		// 获取文件
		Iterable<? extends JavaFileObject> units = fileManager
				.getJavaFileObjects(filename);
		// 编译文件
		CompilationTask t = compiler.getTask(null, fileManager, null, null,
				null, units);
		t.call();
		fileManager.close();
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		Class c = cl.loadClass("com.imooc.proxy.$Proxy0");
		 System.out.println(c.getName());
		 Constructor constructor = c.getConstructor(InvocationHandler.class);
		 return constructor.newInstance(h);
	}
}
