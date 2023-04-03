package Array_Programs;

import java.util.Scanner;

public class ArrayMergeTwoArrays {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size : ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	
	System.out.println("Enter the size1");
	int x=sc.nextInt();
	int b[]=new int[x];
	for (int i = 0; i < b.length; i++) {
		b[i]=sc.nextInt();
	}
	
	int c[]=new int[a.length+b.length];
	
	for (int i = 0; i < a.length; i++) {
		if(c[i]<=a[i])
		{
			c[i]=a[i];
		}
	}
	
	for (int i = 0; i < b.length; i++) {
		if(c[i]<=b[i])
		{
			c[i+a.length]=b[i];	
		}
	}
	
	for (int i = 0; i < c.length; i++) {
		System.out.println(c[i]);
	}
	
}
}
