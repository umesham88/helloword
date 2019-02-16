package com.simple;

public class Program1 {

	public static void main(String[] args) {
		
		String s = "abc&52376#han";
		for(char ch: s.toCharArray()) {
			if(Character.isDigit(ch)) {
				System.out.println(Character.getNumericValue(ch));
			}
		}
		

	}

}
