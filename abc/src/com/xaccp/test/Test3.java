package com.xaccp.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.xaccp.test.Test4.Adapter;
import com.xaccp.test.Test4.ArrayListAdapter;

public class Test3 {
	interface Adapter<E> {
		E pop();
	}

	class ArrayListAdapter<E> implements Adapter<E> {

		public ArrayList<E> list;

		public ArrayListAdapter(Collection<E> coll) {
			this.list = new ArrayList<E>(coll);
		}

		@Override
		public E pop() {
			int index = list.size() - 1;
			E ret = list.remove(index);
			return ret;
		}

	}

	public static void main(String[] args) {
		// Adapter<Integer> adapter = new Test3().new
		// ArrayListAdapter<Integer>(Arrays.asList(1, 2, 3));
		//Adapter<Integer> adapter = new Test3().new ArrayListAdapter<Integer>(
			//	null);
		Adapter<Integer> adapter = (Adapter<Integer>) new Test4().new ArrayListAdapter<Integer>();	
		System.out.println(adapter.pop());
		System.out.println(adapter.pop());
		System.out.println(adapter.pop());
	}

}
