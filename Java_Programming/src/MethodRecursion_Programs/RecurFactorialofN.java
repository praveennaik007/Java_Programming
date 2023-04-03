package MethodRecursion_Programs;

import java.util.Scanner;

public class RecurFactorialofN {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	System.out.println(fact(n));
}
public static int fact(int n)
{
	if(n<=1)
	{
		return n;
	}
	else
	{
		return n*fact(n-1);
	}
}
}
