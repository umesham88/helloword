package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortedArrayElement {

	public static void main(String[] args) {
		int[] inputValue= {83,18,30,15,100};
		System.out.println(getSorted(inputValue));
	}
	
	private static List getSorted(int[] inputValue){
		String s = null;
		String s2 = null;
		List list = new ArrayList<>();
		for(Integer i:inputValue) {
			s = new String(i.toString());
			StringBuffer sb = new StringBuffer(s);
			s2  = sb.reverse().toString();
			list.add(s2);
		}
		Collections.sort(list);
		
		return list;
	}
}
