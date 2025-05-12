package com.test;

import java.util.HashMap;
import java.util.Map;

public class Occurence {
public static void main(String[] args) {
	String s = "Udaya";
	Map<Character, Integer> mp = new HashMap();
	for(int i =0; i <s.length();i++) {
		char ch = s.charAt(i);
		if(mp.containsKey(ch)) {
			mp.put(ch, mp.get(ch)+1);
		}
		else {
			mp.put(ch,1);
		}
	}
	System.out.println(mp);

	// asfnkasndkandknfalsdnl
}
}
