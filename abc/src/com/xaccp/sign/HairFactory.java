package com.xaccp.sign;

import java.util.Map;

public class HairFactory {
      public HairInterface getHair(String key) {
    	  if ("left".equals(key)) {
    		  return new LeftHair();
			
		} else if("right".equals(key)) {
             return new RightHair();
		}
		else{
			return null;
		}
	}
      public HairInterface getHairByClassKey(String key) {
    	  try {
    		  Map<String,String> map = new PorpertiesReader().getPorpertiesNames();
			HairInterface hair = (HairInterface) Class.forName(map.get(key)).newInstance();
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  return null;
	}
}
