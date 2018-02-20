package com.xaccp.test;

import java.util.ArrayList;
import java.util.List;


public class Test4 {
	interface Adapter<E> extends List<E> {
		E pop();
	}
	
	@SuppressWarnings("serial")
	class ArrayListAdapter<E> extends ArrayList<E> implements Adapter<E> {

		@Override
		public E pop() {
			int index = this.size() - 1;
			E ret = null;
//			if (index >= 0) {
				ret = this.remove(index);
//			} else {
//				throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
//			}
			
			return ret;
		}

//		private String outOfBoundsMsg(int index) {
//			return "Index: "+index+", Size: "+list.size();
//		}
		
	}
	
	public static void main(String[] args) {
		Adapter<Integer> adapter = new Test4().new ArrayListAdapter<Integer>();
		adapter.add(1);
		adapter.add(2);
		adapter.add(3);
		System.out.println(adapter.pop());
		System.out.println(adapter.pop());
		System.out.println(adapter.pop());
		System.out.println(adapter.pop());
	}
}