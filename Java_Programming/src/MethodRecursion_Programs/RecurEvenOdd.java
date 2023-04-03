package MethodRecursion_Programs;

import java.util.Scanner;

public class RecurEvenOdd {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number ");
	int start=sc.nextInt();
	System.out.println("Enter the number ");
	int end=sc.nextInt();
	evenOdd(start,end);
	
	
}
public static void evenOdd(int start,int end)
{
if(start>end)
{
	System.out.println("no. is greater");
}
else
{
	if(start%2==0)
	{
		System.out.println(start+" is even");
	}
	else
	{
		System.out.println(start+" is odd");
	}
		
	start++;
	evenOdd(start, end);
}
}
}
