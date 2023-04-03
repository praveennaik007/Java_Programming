package String_Programs;

import java.util.Scanner;

public class CountNoOfWordsStartWithVowel {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	int count=0;
	String str="";
	char ch[]=s.toCharArray();
	for (int i = 0; i < s.length(); i++) {
		
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				count++;
			}
					
		}
		
	}
	System.out.println(count);
}
}
