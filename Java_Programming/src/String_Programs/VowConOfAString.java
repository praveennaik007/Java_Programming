package String_Programs;

import java.util.Scanner;

public class VowConOfAString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name");
	String s= sc.nextLine();
	int count=0;
	int count1=0;
	for (int i = 0; i < s.length(); i++) {
		
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			count++;
		}
		else
		{
			count1++;
		}
		
	}
	System.out.println(count);
}
}
