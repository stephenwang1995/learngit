package com.xaccp.test;

import java.io.Serializable;

public class Student implements Serializable{
	String name;
	int age;
	
	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public boolean equals(Object obj){
		if (obj==null) return false;
		if (!(obj instanceof Student)) return false;
		Student stu=(Student) obj;
		return stu.name.equals(this.name)&& stu.age==this.age;
		
		
		
	}
	

}
