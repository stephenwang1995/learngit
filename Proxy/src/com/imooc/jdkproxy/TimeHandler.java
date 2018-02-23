package com.imooc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
 private Object target;
 
	/**
 * @param target
 */
public TimeHandler(Object target) {
	super();
	this.target = target;
}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		long startTime = System.currentTimeMillis();
		method.invoke(target);
		long endTime = System.currentTimeMillis();
		System.out.println("开车时间" + (endTime - startTime) + "毫秒");
		return null;
	}

}
