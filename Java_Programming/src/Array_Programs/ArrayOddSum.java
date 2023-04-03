package Array_Programs;

import java.util.Scanner;

public class ArrayOddSum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Using Index Position sum of odd numbers");
	int sum=0;
	for (int i = 0; i <=a.length-1; i++) {
		if(i%2!=0)
		{
			sum+=a[i];
		
		}
	}
	System.out.println(sum);
	
	System.out.println("Using Normal Way sum of odd numbers");
	
	int sum1=0;
	for (int i = 0; i <=a.length-1; i++) {
		if(a[i]%2!=0)
		{
			sum1+=a[i];
		
		}
	}
	System.out.println(sum1);
	
}
}
