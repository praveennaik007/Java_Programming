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
	int count=0;
	for (int i = 0; i < a.length; i++) {
		int x=a[i];
		if(x==1)
		{
			continue;
		}
		boolean rs=true;
	for (int j = 2; j < x; j++) {
		
		if(a[i]%j==0)
		{
//			rs=false;
//			break;
			count++;
		}
	}
	if(count==0)
	//if(rs)
	{
		System.out.println(x+" prime");
	}
	else
	{
		System.out.println(x+" not prime");
	}
	}
}
}
