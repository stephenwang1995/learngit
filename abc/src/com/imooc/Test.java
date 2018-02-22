package com.imooc;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Singerton s1 = Singerton.instance;
		// Singerton s2 = Singerton.instance;
		Singerton s1 = Singerton.getInstace();
		Singerton s2 = Singerton.getInstace();
		if (s1 == s2) {
			System.out.println("s1==s2");

		} else {
			System.out.println("s1!=s2");
		}
		Singerton1 s3 = Singerton1.getInstace();
		Singerton1 s4 = Singerton1.getInstace();
		if (s3 == s4) {
			System.out.println("s1==s2");

		} else {
			System.out.println("s1!=s2");
		}
	}
}
