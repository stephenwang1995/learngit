package com.xaccp.test;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {

		File file1 = new File("D:/test1");
		File file2 = new File("D:/test2");
		if (!file1.exists()) {
			file1.mkdir();

		}
		if (!file2.exists()) {
			file2.mkdir();

		}
		System.out.println("name:" + file1.getName() + "path:"
				+ file1.getAbsolutePath());
		File test = new File("D:/test1/test.txt");
		if(!test.exists()){
			  try {
				boolean result=test.createNewFile();
				 if (result) {
					  System.out.println("success");
				} else {
				       System.out.println("failure");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}
}
