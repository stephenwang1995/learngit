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
        //...对vector的操作
        //...与vector无关的其他操作
    }
	public static void main(String[] args) {
		method();
	}
}
