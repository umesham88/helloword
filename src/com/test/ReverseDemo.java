package com.test;

public class ReverseDemo {

	public static void main(String[] args) {
		System.out.println(reverse("EARTH"));
		
	}
	private static String reverse(final String inputValue) {
		String output = " ";
		StringBuffer sb = new StringBuffer(inputValue);
		output = new String(inputValue+"|"+sb.reverse());
		return output;
	}
}
