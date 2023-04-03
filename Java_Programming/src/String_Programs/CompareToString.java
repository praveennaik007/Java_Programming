package String_Programs;

import java.util.Scanner;

public class CompareToString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name1 ");
	String s10=sc.nextLine();
	System.out.println("Enter the name2 ");
	String s11=sc.nextLine();
	System.out.println(s10.compareTo(s11));
}
}
