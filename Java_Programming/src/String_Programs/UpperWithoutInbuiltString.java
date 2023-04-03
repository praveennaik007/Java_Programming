package String_Programs;

import java.util.Scanner;

public class UpperWithoutInbuiltString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	String str="";
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		
		str+=(char)(ch-32);
		
	}
	System.out.println(str);
}
}
