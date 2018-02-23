package com.imooc.cglibproxy;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cglibproxy proxy=new Cglibproxy();
		Train t = (Train) proxy.getProxy(Train.class);
		t.move();

	}

}
