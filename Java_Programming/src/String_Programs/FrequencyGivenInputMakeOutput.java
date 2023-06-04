package String_Programs;

import java.util.Scanner;

public class FrequencyGivenInputMakeOutput {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	
	String visited="";
	
	for (int i = 0; i < s.length(); i++) 
	{
		char ch=s.charAt(i);
		int  count=1;
		if(visited.indexOf(ch)== -1)
		{ 
			
			for (int j = i+1;j<s.length();j++) 
			{
				
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}			
			}			
			if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
			{
//				vow++;
				System.out.print(ch+""+count);

			}
		visited+=ch;
	}
}
}
}
