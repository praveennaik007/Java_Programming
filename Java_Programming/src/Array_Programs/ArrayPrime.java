package Array_Programs;

import java.util.Scanner;

public class ArrayPrime {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Size ");
	int n=sc.nextInt();
	int a[]= new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	
	for (int i = 0; i < a.length; i++) {
		boolean rs=true;
	for (int j = 2; j < a[i]; j++) {
		
		if(a[i]%j==0)
		{
			rs=false;
			break;
		}
	}
	if(rs)
	{
		System.out.println(a[i]+" prime");
	}
	else
	{
		System.out.println(a[i]+" not prime");
	}
	}
}
}
