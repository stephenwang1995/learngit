package com.xaccp.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

public class ReflectionDemo {
	public ReflectionDemo(){
	   String classpath = JOptionPane.showInputDialog(null, "������ȫ·��");
               Class cla = null;
			try {
				cla = Class.forName(classpath);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				cla = Class.forName(classpath);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
               Field[] fields = cla.getDeclaredFields();
	  
            for (Field field : fields) {
            	System.out.println("���ԣ�"+field.toString());
				
			}
            Method[] methods = cla.getDeclaredMethods();
            for (Method method : methods) {
				System.out.println("����:"+method.toString());
			} 
  }
	public static void main(String[] args) {
		ReflectionDemo reflectionDemo = new ReflectionDemo();
	}
}
