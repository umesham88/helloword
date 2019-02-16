package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int[] inputValues = {2,45,39,91,19};
		System.out.println(getSecondSmallestNumber(inputValues));
	}
	
	public static int getSecondSmallestNumber(int[] inputValues) {
		
		int outputValue = 0;
		List list = new ArrayList<>();
		for(int i:inputValues) {
			list.add(i);
		}
		Collections.sort(list);
		Object[] obj = list.toArray();
		outputValue = (int) obj[1];
		return outputValue;
	}
}
