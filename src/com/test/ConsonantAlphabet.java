package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConsonantAlphabet {

	public static final String CONSONANT = "bcdfghjklmnopqrstvwxyz";

	public static String getConsonentAlphabet(final String inputValue) {
		String ouputValue = "";

		char[] chr = inputValue.toCharArray();
		int length = chr.length;
		for (int i = 0; i < length; i++) {
			char ch = chr[i];
			char lower = Character.toLowerCase(ch);
			int idx = CONSONANT.indexOf(lower);
			if (idx != -1) {
				char next = CONSONANT.charAt((idx + 1));
				chr[i] = (ch == lower ? next : Character.toUpperCase(next));
			}
		}
		ouputValue = new String(chr);
		return ouputValue;
	}

	public static void main(String[] args) {
		System.out.println(getConsonentAlphabet("JAvAMKKH"));
	}
}
