package com.xaccp.sign;

public class Test {
	public static void main(String[] args) {
		
	
//   HairInterface right=new RightHair();
//   right.draw();
		   HairFactory factory = new HairFactory();
		   HairInterface left=factory.getHair("left");
//		   HairInterface left=factory.getHairByClass("com.xaccp.sign.LeftHair");
		   left.draw();
		   
}
}