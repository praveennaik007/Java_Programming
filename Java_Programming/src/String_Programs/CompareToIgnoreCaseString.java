package String_Programs;

import java.util.Scanner;

public class CompareToIgnoreCaseString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name1 ");
	String s12=sc.nextLine();
	System.out.println("Enter the name2 ");
	String s13=sc.nextLine();
	System.out.println(s12.compareToIgnoreCase(s13));
}
}
