package com.xaccp.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	int a = 1;

	static class innerclass1 {
		int c = 3;
	}

	class innerclass {
		int b = 2;
	}

	public static void main(String[] args) {
      Test out =new Test();
      Test.innerclass in=out.new innerclass();
      System.out.println(in.b);
      innerclass1 in1=new innerclass1();
      System.out.println(in1.c);
      List a =new ArrayList();
      
      
	}
}
