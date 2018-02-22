package com.imooc;

public class Singerton1 {
   private Singerton1(){   
   }
    private static Singerton1 instance;
    public static Singerton1 getInstace(){
    	if (instance == null) {
    		instance=new Singerton1();
    	}
			return instance;
		
    	
    }
}
