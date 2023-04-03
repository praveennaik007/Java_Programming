package String_Programs;

import java.util.Scanner;

public class CountLowerCaseSpecialChar {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name ");
	String s = sc.nextLine();
	int lc=0;
	int sp=0;
	int num=0;
	int uc=0;
	String str="";
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		if(ch>='a'&&ch<='z')
		{
			
			lc++;
		}
		else if(ch>='A'&&ch<='Z')
		{
			uc++;
		}
		else if(ch>='0'&&ch<='9')
		{
			
			num++;
		}
		else
		{
			sp++;
		}
	}
	System.out.println("Upper Case "+uc+" Lower case "+lc+" number "+" "+num+" Special char "+sp);
}
}
