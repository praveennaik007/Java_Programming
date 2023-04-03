package String_Programs;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="anagram";
	String s2="nagaram";
	boolean rs=anagram(s1,s2);
	if(rs==true)
	{
		System.out.println("Anagram");
	}
	else
	{
		System.out.println("Not an anagram");
	}
}
public static boolean anagram(String s1,String s2)
{
	boolean rs=false;
	if(s1.length()!=s2.length())
	{
		return false;
	}
	
		
	char c1[]=s1.toCharArray();
	Arrays.sort(c1);
	char c2[]=s2.toCharArray();
	Arrays.sort(c2);
	for (int i = 0; i < c1.length; i++) {
		if(c1[i]==c2[i])
		{
			rs=true;
		}
	
	}
	return rs;
}

}
