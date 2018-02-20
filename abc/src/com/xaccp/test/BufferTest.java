package com.xaccp.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferTest {
	public static void main(String[] args) {
		try {
			File file = new File("D:/test1/test.txt");
//			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			long startTime = System.currentTimeMillis();
			int i;
			while ((i=bis.read())!=-1) {
				//hellow
			}
			long endTime=System.currentTimeMillis();
			System.out.println(endTime-startTime);
			bis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
