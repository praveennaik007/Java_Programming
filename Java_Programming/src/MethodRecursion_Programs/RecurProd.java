package MethodRecursion_Programs;

import java.util.Scanner;

public class RecurProd {
public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the number ");
//	int a=sc.nextInt();
	System.out.println(prod(10));
}

private static int prod(int n) {

	if(n<=1)
	{
		return n;
	}
	else
	{
		return n*prod(n-1);

	}
	
	
}
}
