package String_Programs;

import java.util.Scanner;

public class Print3rdIndexString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	System.out.println(s.charAt(3));
	
	System.out.println("=================");
	System.out.print(s.charAt(0)+","+s.charAt(s.length()-1)+" ");
	System.out.println("=============");
	System.out.println(s.contains("a")+" "+s.indexOf("a"));
}
}
