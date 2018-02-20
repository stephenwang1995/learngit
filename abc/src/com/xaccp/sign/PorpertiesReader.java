package com.xaccp.sign;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PorpertiesReader {
    public Map<String,String> getPorpertiesNames() {
    	Properties prop=new Properties();
    	Map<String,String> map=new HashMap<String,String>();
		InputStream in = getClass().getResourceAsStream("type.properties");
		try {
			prop.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Enumeration name = prop.propertyNames();
		while (name.hasMoreElements()) {
			String key = (String) name.nextElement();
			String value=(String) prop.getProperty(key);
			map.put(key, value);
		}
		return map;
		
	}
}
