package com.imooc;

public class Singerton {
   private Singerton(){   
   }
    private static Singerton instance= new Singerton();
    public static Singerton getInstace(){
    	return instance;
    }
}
