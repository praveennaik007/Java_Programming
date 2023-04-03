package String_Programs;

import java.util.Scanner;

public class StringDuplicateFind {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	String visited="";
	
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		if(visited.indexOf(s.charAt(i))==-1)
		{
		for (int j = i+1; j < s.length(); j++) {
			if(s.charAt(i)==s.charAt(j))
			{
				System.out.println("Duplicate elements : "+s.charAt(i));
				visited+=s.charAt(i);
				break;
			}
			
		}
		
		}
	}
	
}
}
