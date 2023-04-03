package String_Programs;

import java.util.Scanner;

public class NameEvenUpperOddinLower {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	String str="";
	str=s.toUpperCase();
	String temp="";
	for (int i = 0; i < s.length(); i++) {
		if(i%2==0)
		{
			temp=temp+(char)(s.charAt(i)-32);
		}
		else
		{
			temp+=(char)(s.charAt(i));
		}
		
	}
	System.out.println(temp);
	
	
}
}
