package MethodRecursion_Programs;

import java.util.Scanner;

public class RecurPower {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the base number ");
int a=sc.nextInt();
System.out.println("Enter the power ");
int b=sc.nextInt();

System.out.println(pow(a, b));
}
public static int pow(int base,int pow)
{
	if(pow==1)
	{
		return base;
	}
	else
	{
		return base*pow(base, pow-1);
	}
}
}
