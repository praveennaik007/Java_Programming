package Array_Programs;

import java.util.Scanner;

public class ArrayIdentical {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the size2 ");
	int x=sc.nextInt();
	int b[]=new int[x];
	for (int i = 0; i < b.length; i++) {
		b[i]=sc.nextInt();
	}
	boolean rs=false;
	for (int i = 0; i < a.length; i++) {
		if(a.length==b.length)
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i]==b[i])
				{
					rs=true;
					break;
				}
				else
				{
					rs=false;
				}
			}
		}
	}
	if(rs==true)
	{
		System.out.println("Identical ");
	}
	else
	{
		System.out.println("Not Identical");
	}
}
}
