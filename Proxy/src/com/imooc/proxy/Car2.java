package com.imooc.proxy;

import java.util.Random;

public class Car2 extends Car {
	public void move() {
		long startTime = System.currentTimeMillis();
		super.move();
		long endTime = System.currentTimeMillis();
		System.out.println("����ʱ��" + (endTime - startTime) + "����");
	}
}
