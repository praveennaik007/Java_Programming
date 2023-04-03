package String_Programs;

import java.util.Scanner;

public class PrintEvenIndexString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	String str="";
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		if(i%2==0)
		{
			str+=ch+",";
		}
	}
	System.out.println(str);
}
}
