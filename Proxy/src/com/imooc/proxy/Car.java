package com.imooc.proxy;

import java.util.Random;


public class Car implements Moveable {

	@Override
	public void move() {
//		long startTime = System.currentTimeMillis();
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("开车时间"+(endTime-startTime)+"毫秒");
	}
	  
	  
}
