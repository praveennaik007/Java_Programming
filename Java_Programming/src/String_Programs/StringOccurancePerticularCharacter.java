package String_Programs;

import java.util.Scanner;

public class StringOccurancePerticularCharacter {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	char c='a';
	int count=0;
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		
		if(ch==c)
		{
			count++;
		}
	}
	System.out.println(count);
	
}
}
