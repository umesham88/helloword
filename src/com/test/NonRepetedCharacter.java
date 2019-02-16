package com.test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class NonRepetedCharacter {

	public static char getNonRepetedCharacter(String inputValue) {
		char cha=' ';
		char[]  chr = inputValue.toCharArray();
		Map<Character,Integer> mapToInputValue = new LinkedHashMap<>();
		for(char ch:chr) {
			if(mapToInputValue.containsKey(ch)) {
				mapToInputValue.put(ch, mapToInputValue.get(ch) + 1);
			}else {
				mapToInputValue.put(ch, 1);
			}
		}
		
		Set<Character> setOfCharacter = mapToInputValue.keySet();
		Iterator it = setOfCharacter.iterator();
		while(it.hasNext()) {
			cha = (char)it.next();
		}
		return cha;
	}
	public static void main(String[] args) {
		
		
		String inputValue = "umeushame";
		char ch = getNonRepetedCharacter(inputValue);
		System.out.println(ch);
		
	}
}
