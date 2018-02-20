package com.xaccp.test;

import java.util.ArrayList;

public class StuTest extends Student {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("Tom", 18));
		list.add(new Student("jerry", 10));
		list.add(new Student("hesy", 22));
		System.out.println(list.contains(new Student("Tom", 18)));
		System.out.println(list.indexOf(new Student("jerry", 10)));
		System.out.println(list.remove(new Student("hesy", 22)));
		
		

	}
}
