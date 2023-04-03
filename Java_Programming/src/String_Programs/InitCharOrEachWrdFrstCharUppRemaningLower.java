package String_Programs;

import java.util.Arrays;
import java.util.Scanner;
//Each word first character is in uppercase remaining lowercase
public class InitCharOrEachWrdFrstCharUppRemaningLower {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("!== Using split Method ==!");
	
	System.out.println("Enter the name ");
	String st=sc.nextLine();
	String s1="";
	st=st.toLowerCase();
	String str[]=st.split("");
	System.out.println(Arrays.toString(str));
	for (int i = 0; i < str.length; i++) {
		char ch=st.charAt(i);
		if(i==0||st.charAt(i-1)==' ')
		{
			s1+=str[i].toUpperCase();
		}
		else
		{
			s1+=str[i];
		}
	}
	System.out.println(s1);
	
	System.out.println("!== Without using inbuilt method ==!");
	
	String s="PraVeen kuMar nAik  ";
	s=s.toLowerCase();
	char ch[]=s.toCharArray();
	String strg="";
	for(int i=0;i<ch.length;i++)
	{
			if(i==0 || (ch[i-1]==' '))
			{
				strg+=(char)(ch[i]-32);
			}
			else
			{
				strg+=ch[i];
			}		
	}
	System.out.println(strg);
	
	
}
}
