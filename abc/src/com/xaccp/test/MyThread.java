package com.xaccp.test;

import java.util.TimerTask;

public class MyThread extends TimerTask implements Runnable  {

	@Override
	public void run() {
		System.out.println("���߳̿�ʼִ��");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ӳ���ִ�����");
		
	}
  
}
