package com.imooc.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class Cglibproxy implements MethodInterceptor{
	private Enhancer enhancer=new Enhancer();
    public Object getProxy(Class clazz) {
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	@Override
	public Object intercept(Object obj, Method m, Object[] arg,
			MethodProxy proxy) throws Throwable {
		System.out.println("¼ÇÂ¼ÈÕÖ¾");
		proxy.invokeSuper(obj, arg);
		return null;
	}

}
