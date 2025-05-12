package com.Count;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
	public static void main(String[] args) {
		String s="SwethaVenugopal";
		
Map<Character, Integer> map=new LinkedHashMap();
char[] s1=s.toCharArray();
		
		for(char x:s1) {
			if(map.containsKey(x)) {
				Integer integer=map.get(x);
				map.put(x, integer+1);
			}
			else {
				map.put(x,1);
			}
		}
		System.out.println(map);
		
		System.out.println("New Update");
		System.out.println("New Update");
		System.out.println("New Update");
		System.out.println("New Update");
				}

}
