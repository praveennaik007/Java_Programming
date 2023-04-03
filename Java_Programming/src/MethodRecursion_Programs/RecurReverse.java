package MethodRecursion_Programs;

import java.util.Scanner;

public class RecurReverse {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	System.out.println(rev(n));
}
public static int rev(int n)
{
	//54321
	if(n<=9)
	{
		return n;
	}
	else
	{
		int rev=0;
		int x=n%10;
		rev=10*rev+x;
		n/=10;
		System.out.print(rev);
		return rev(n);
	}
}
}
