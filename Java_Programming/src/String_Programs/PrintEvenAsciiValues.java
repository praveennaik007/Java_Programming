package String_Programs;

import java.util.Scanner;

public class PrintEvenAsciiValues {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	int count=0;
	for (int i = 0; i < s.length(); i++) {
		int n=s.charAt(i);
		if(n%2==0)
		{
			count++;
		}
			
	}
	System.out.print(count+" ");
	
	char ch='a';
	int i=ch;
	System.out.println(i);
}
}
