package String_Programs;

import java.util.Scanner;

public class CompareUsingEqualityOp {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name1 ");
	String s=sc.nextLine();
	System.out.println("Enter the name2 ");
	String s1=sc.nextLine();
	System.out.println(s==s1);
	
	System.out.println("Enter the name1 ");
	String s2=sc.nextLine();
	System.out.println("Enter the name2 ");
	String s3=sc.nextLine();
	System.out.println(s2.equals(s3));
	
	System.out.println("Enter the name1 ");
	String s4=sc.nextLine();
	System.out.println("Enter the name2 ");
	String s5=sc.nextLine();
	System.out.println(s4.equalsIgnoreCase(s5));
	
	System.out.println("Enter the name1 ");
	String s6=sc.nextLine();
	System.out.println("Enter the name2 ");
	String s7=sc.nextLine();
	System.out.println(s6.compareTo(s7));
	
}
}
