package String_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class StringValidmail {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name ");
	String s= sc.nextLine();
//	String s="praveen@gmail.com";
	
	if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
	{
	if(s.endsWith(".com") || s.endsWith(".in") || s.endsWith(".org"))
		{
			if(s.contains("@"))
					{
						System.out.println("valid email id");
					}
			
		}
	
	}
	else
	{
		System.out.println("not valid");
	}	
}
}
