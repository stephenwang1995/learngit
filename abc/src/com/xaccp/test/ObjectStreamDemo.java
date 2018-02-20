package com.xaccp.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo extends Student {
 public static void main(String[] args) {
	try {
		Student student1 = new Student("tom",18);
		Student student2 = new Student("hessy",20);
		  FileOutputStream fos = new FileOutputStream("D:/test1/test.txt");
		  ObjectOutputStream oos = new ObjectOutputStream(fos);	
		  oos.writeObject(student1);
		  oos.writeObject(student2);
		  oos.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
         File file = new File("D:/test1/test.txt");
         try {
			FileInputStream fis = new FileInputStream(file);
			 ObjectInputStream ois = new ObjectInputStream(fis);
			 Student stu1=(Student) ois.readObject();
			 Student stu2=(Student) ois.readObject();
			 ois.close();
			 System.out.println(stu1);
			 System.out.println(stu2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
