package com.test;

public class Stringoccurence {
	public static void main(String[] args) {
        String text = "Stay home, Stay safe, Stay healthy";
        String substring = "Stay";

        int count = 0;

        for (int i = 0; i <= text.length() - substring.length(); i++) {
            if (text.substring(i, i + substring.length()).equals(substring)) {
                count++;
            }
        }

        System.out.println("The word '" + substring + "' appears " + count + " times.");
    }
}
