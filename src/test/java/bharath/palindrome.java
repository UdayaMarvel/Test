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
	System.out.println("no");
	
	
	
}

}
