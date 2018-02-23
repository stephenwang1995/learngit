package com.imooc.proxy;

import java.io.IOException;

public class Client {

	public static void main(String[] args) throws Exception {
		Car car = new Car();
		TimeHandler timeHandler = new TimeHandler(car);
		Moveable m=(Moveable) Proxy.newProxyInstance(Moveable.class,timeHandler);
		m.move();
        
	}

}
