package com.xaccp.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	static int size = 0;
	List elementData = new ArrayList();
	int popFlag = 0;

	public String pop() {
		if (size == 0)
			return null;
		else
			popFlag--;
		String a = String.valueOf(elementData.get(popFlag));
		
		return a;
	}

	public void add(Object element) {
		elementData.add(element);
		popFlag++;
		size++;
	}

	public Object get(int index) {
		return elementData.get(index);
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		System.out.println(t.pop());
		t.add(0);
		t.add(1);
		System.out.println(t.pop());
		System.out.println(t.pop());
	}
}
