package com.xaccp.test;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
 public static void main(String[] args) {
	HashSet<String> hashSet = new HashSet<String>();
	hashSet.add("a");
	hashSet.add("b");
	hashSet.add("c");
	Iterator<String> iter = hashSet.iterator();
	while (iter.hasNext()) {
		String string = (String) iter.next();
		if (string.equals("b")){
			iter.remove() ;
		 }
		System.out.println(string);
	}
	Iterator<String> iters = hashSet.iterator();
	while (iters.hasNext()) {
		String string = (String) iters.next();
		System.out.println(string);
	}
//	for (String set : hashSet) {
//		 if (set.equals("b")){
//			 hashSet.remove(set) ;
//		 }
//		System.out.println(set);
//		
//	}
     
	
}
}
