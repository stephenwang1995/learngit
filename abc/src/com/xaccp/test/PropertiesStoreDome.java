package com.xaccp.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesStoreDome {
	public static void main(String[] args) {
//       File f = new File("D:/config.properties");
//       try {
//		Properties prop = new Properties();
//		   prop.put("123", "abc");
//		   prop.put("234", "bcd");
//		   prop.store(new FileOutputStream(f), "≈‰÷√Œƒº˛");
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
       File f1 = new File("D:/config.properties");
       Properties prop1 = new Properties();
       try {
		prop1.load(new FileInputStream(f1));
		   String a=prop1.getProperty("123");
		   String b=prop1.getProperty("234");
		   System.out.println(a);
		   System.out.println(b);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       
	}
}
