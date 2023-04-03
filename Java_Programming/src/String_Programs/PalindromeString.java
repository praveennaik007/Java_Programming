package String_Programs;

import java.util.Scanner;

public class PalindromeString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String s=sc.nextLine();
	String str="";
	for (int i = s.length()-1; i >=0; i--) {
		char ch=s.charAt(i);
		str+=ch;	
	}
	if(str.equals(s))
	{
		System.out.println("Palindrome ");
	}
	else
	{
		System.out.println("Not palindrome");
	}
}
}
