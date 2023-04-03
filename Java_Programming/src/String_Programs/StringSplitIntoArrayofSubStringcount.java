package String_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class StringSplitIntoArrayofSubStringcount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name ");
	String s= sc.nextLine();
	String str[]=s.split(" ",1);
	 
	System.out.println(Arrays.toString(str));
	System.out.println(str.length);
	
}
}
