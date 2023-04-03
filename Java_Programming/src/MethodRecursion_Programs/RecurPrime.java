package MethodRecursion_Programs;

import java.util.Scanner;

public class RecurPrime {
	static int i=2;
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	int i=2;
	if(isPrime(n))
	{
		System.out.println("Prime Number ");
	}
	else
	{
		System.out.println("Not Prime Number ");
	}
}

public static boolean isPrime(int n)
{
	if(n==1)
		return false;
	if(i==n/2+1)
	return true;
	
	if(n%i==0)
	{
		return false;
	}
	i++;
		return isPrime(n);
}

}
