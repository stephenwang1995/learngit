package com.xaccp.test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import java.util.ArrayList;
import java.util.List;

public class Test2<Integer> extends ArrayList {

	static void method(){
        Vector vector = new Vector();
        for (int i = 1; i<100; i++)
        {
            Object object = new Object();
            vector.add(object);
            object = null;
        }
        //...��vector�Ĳ���
        //...��vector�޹ص���������
    }
	public static void main(String[] args) {
		method();
	}
}
