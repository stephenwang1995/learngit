package com.xaccp.test;

import java.util.TimerTask;

public class MyThread extends TimerTask implements Runnable  {

	@Override
	public void run() {
		System.out.println("子线程开始执行");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("子程序执行完毕");
		
	}
  
}
