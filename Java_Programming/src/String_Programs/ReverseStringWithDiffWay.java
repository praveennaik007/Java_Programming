package String_Programs;

import java.util.Scanner;

public class ReverseStringWithDiffWay {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	String str="";
	for (int i =s.length()-1; i >=0; i--) {
		char ch=s.charAt(i);
		str+=ch;
	}
	System.out.println(str);
	String str1="";
	char ch[]=s.toCharArray();
	for (int i =0; i < str.length(); i++) {
		if(i==ch[0])
		{
			str1+=(char)(ch[0]-64);
		}
		else
		{
			 str1+=(char)(ch[i]+1);
		}
			
		
		
	}
System.out.println(str1);
}
}
