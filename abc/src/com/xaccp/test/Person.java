package com.xaccp.test;

public class Person {
	private String name;
	private String genter;
	private int age;
    
	public Person() {
		super();
	}

	public Person(String name, String genter, int age) {
		super();
		this.name = name;
		this.genter = genter;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenter() {
		return genter;
	}

	public void setGenter(String genter) {
		this.genter = genter;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
