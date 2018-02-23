package com.imooc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.imooc.proxy.Car;
import com.imooc.proxy.Moveable;

public class Test {
 public static void main(String[] args) {
	Car car = new Car();
	InvocationHandler h = new TimeHandler(car);
	Class<? extends Car> cls = car.getClass();
	Moveable m=(Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
	System.out.println(m.getClass().getName());
	m.move();
}
}
