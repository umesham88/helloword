package com.test;

import java.lang.Character.UnicodeBlock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConsonantAlphabets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="vidson is umesh friend";
		String[]  s1=s.split(" ");
		ArrayList<String> s2=new ArrayList<>();
		for(int i=0;i<s1.length;i++) {
			s2.add(s1[i]);
		}
		Collections.sort(s2);
		for(String s3:s2) {
			System.out.println(s3);
		}
		
	}
}
