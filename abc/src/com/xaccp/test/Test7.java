package com.xaccp.test;

import java.sql.Date;

public class Test7 {
  public static void main(String[] args) {
	Class pclass=Person.class;
	 Date d;
	 
	try {
		d = (Date)pclass.newInstance();
		System.out.println(d.toString());
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
