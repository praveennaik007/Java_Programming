package String_Programs;

import java.util.Scanner;

public class NameFirstcharLastchar {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.next();
	System.out.println(s.charAt(0)+" "+s.charAt(s.length()-1));
}
}
