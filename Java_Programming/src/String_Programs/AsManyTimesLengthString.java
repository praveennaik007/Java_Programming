package String_Programs;

import java.util.Scanner;

public class AsManyTimesLengthString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name");
	String s=sc.nextLine();
	for (int i = 0; i < s.length(); i++) {
		System.out.println(s.length());
	}
}
}
