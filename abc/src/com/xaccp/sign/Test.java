package com.xaccp.sign;

public class Test {
	public static void main(String[] args) {
		
	
//   HairInterface right=new RightHair();
//   right.draw();
		   HairFactory factory = new HairFactory();
//		   HairInterface left=factory.getHair("right");
//		   HairInterface left=factory.getHairByClass("com.xaccp.sign.LeftHair");
//		   HairInterface hair = factory.getHairByClassKey("in");
//		   hair.draw();
		    MCFactory mcFactory = new MCFactory();
		    Boy boy = mcFactory.getBoy();
		    boy.drawMan();
}
}