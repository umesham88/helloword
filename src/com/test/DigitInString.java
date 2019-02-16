package com.test;

public class DigitInString {

	public static void main(String[] args) {
		System.out.println(getDigit("Hel816loo"));
	}
	private static String getDigit(String inputValue) {
		String s = null; 
		
		/*char[] chr = inputValue.toCharArray();
		for(char ch:chr) {
			if(Character.isDigit(ch)) {
				System.out.println(ch + " ");
				s = ch + " ";
			}
		}*/
		s = inputValue.replaceAll("[^0-9]", " ").trim();
		return s;
	}
}
