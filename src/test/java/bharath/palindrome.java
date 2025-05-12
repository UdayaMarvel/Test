package bharath;

public class palindrome {
	
	public static void main(String[]args) {

String a = "malayalam";
	
	char []b=a.toCharArray();
	
	for (int i=b.length-1;i>=0;i--) {
		
		System.out.print(b[i]);

	}		
	System.out.println(" ");
	
	String d= new String (b);

	if (a.equals(d)) {
		System.out.println("palindrom");
	}
	else {System.out.println("not a palindrom");}
	System.out.println("update in local");
<<<<<<< HEAD
	System.out.println("no");
	
	
	
=======
		system.out.println("bharath");
>>>>>>> 255cbb9c090d53cc47e378a502db052c32a21893
	System.out.println("new update in remote");
}

}
