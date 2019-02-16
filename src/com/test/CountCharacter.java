package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharacter {

	public static void main(String[] args) {
		char[] chr = {'P','E','O','P','L','E','K','P'};
		
		Set<Entry<Character,Integer>> entrySet = countCharacter(chr).entrySet();
		for(Entry<Character,Integer> entry:entrySet) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println();
	}
	
	private static Map countCharacter(char[] chr) {
		
		Map<Character,Integer> map = new HashMap<>();
		int l = chr.length;
		char ch;
		for(int c = 0; c < l; c++) {
			ch = chr[c];
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				count++;
				map.put(ch, count);
			}else {
				map.put(ch, 1);
			}
		}
		return map;
	}
}
