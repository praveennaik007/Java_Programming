package Array_Programs;

import java. util.Scanner;

public class ArraySecondOccurance {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	int count=0;
	System.out.println(" Enter Search element");
	int x=sc.nextInt();
	boolean rs=false;
	int i = 0;
	for ( i = 0; i < a.length; i++) {
		if(a[i]==x)
		{
			count++;
		}
		if(count==2)
		{
			rs=true;
			
		break;
		}	
	}
	if(rs==true)
	{
		System.out.println(i);
	}
	else
	{
		System.out.println("Enter the valid element");
	}
	
	
}
}
