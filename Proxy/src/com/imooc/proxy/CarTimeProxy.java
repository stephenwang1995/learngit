package com.imooc.proxy;

public class CarTimeProxy implements Moveable {

	private Moveable m;
	

	/**
	 * @param car
	 */
	public CarTimeProxy( Moveable m) {
		super();
		this.m = m;
	}


	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		m.move();
		long endTime = System.currentTimeMillis();
		System.out.println("����ʱ��" + (endTime - startTime) + "����");
	}
  
}
