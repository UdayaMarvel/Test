package pavish.occurance;

import java.util.Scanner;

public class PavishOccuranceProgram {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        int[] count = new int[256]; // For ASCII characters

	        for (int i = 0; i < input.length(); i++) {
	            count[input.charAt(i)]++;
	        }

	        System.out.println("Character Occurrences:");
	        for (int i = 0; i < 256; i++) {
	            if (count[i] > 0) {
	                System.out.println((char)i + ": " + count[i]);
	            }
	        }

	        sc.close();
	    }


	}


