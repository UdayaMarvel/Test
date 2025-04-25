package testjava;


import java.util.HashMap;
import java.util.Map;

public class project {

		    public static void main(String[] args) {
		        String input = "hello world";
		        Map<Character, Integer> charMap = new HashMap<>();

		        for (char ch : input.toCharArray()) {
		            if (ch != ' ') { 
		                charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
		            }
		        }

		        System.out.println("Character Occurrences:");
		        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    }
		


	}


