package MethodRecursion_Programs;

import java.util.Scanner;

public class RecurFibonacci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int a=sc.nextInt();
	System.out.println(fibonacci(a));
}

public static int fibonacci(int a) {
	
if(a<=1)
{
	
	return a;	
}
else 
	
{
	return (fibonacci(a-1)+fibonacci(a-2));	
}
	
}
}
