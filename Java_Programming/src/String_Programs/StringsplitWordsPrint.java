package String_Programs;

import java.util.Scanner;

public class StringsplitWordsPrint {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	String str[]=s.split(" ");
	for (int i = 0; i < str.length; i++) {
		System.out.println(str[i]);
	}
	
}
}
