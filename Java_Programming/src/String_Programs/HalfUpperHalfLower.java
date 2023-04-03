package String_Programs;

import java.util.Scanner;

public class HalfUpperHalfLower {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	System.out.println("== Using Inbuilt Method ==");
	String st1=s.substring(0,s.length()/2);
	String str1=s.substring(s.length()/2);
	String lc=st1.toLowerCase();
	String uc=str1.toUpperCase();
	System.out.print(lc);
	System.out.print(uc);
	
	
	System.out.println();
	System.out.println("== Normal Way ==");
	
	String str="";
	int st=s.length()/2;
	char ch;
	for (int i = 0; i <s.length(); i++) {
		 ch=s.charAt(i);
		 if(i<st)
		 {
			 str+=(char)(ch-32);
		 }
		 else
		 {
			 str+=ch;
		 }
		 
	}
	
	System.out.println(str);
}
}
