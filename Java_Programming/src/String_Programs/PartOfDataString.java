package String_Programs;

import java.util.Scanner;

public class PartOfDataString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	System.out.println(s.substring(1,5));
}
}
