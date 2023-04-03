package String_Programs;

import java.util.Scanner;

public class RevString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	String rev="";
	for (int i = s.length()-1; i >=0; i--) {
		char ch=s.charAt(i);
		rev=rev+ch;
	}
	System.out.println(rev);
			
}
}
