package com.xaccp.test;

public class Test5 {
	public static void main(String[] args) {		

//	dealArray();
	dealArray(1);
	dealArray(1,2,5);
	
}
  public static void dealArray(int...intArray){
	  int max=Integer.MIN_VALUE;
	 for (int i : intArray) {
		max= i>max ? i:max;
	}
	 System.out.println("max_munber="+max);
	}
}
