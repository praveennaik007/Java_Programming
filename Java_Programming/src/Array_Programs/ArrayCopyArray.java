package Array_Programs;

import java.util.Scanner;

public class ArrayCopyArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Using Copy Array ");
	System.out.println("Enter the size : ");
	int n=sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[a.length];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();		
	}	
	for (int i = 0; i < a.length; i++) {
		b[i]=a[i];
		System.out.println("Actual values present "+a[i]);
	}
	System.out.println();
	for (int i = 0; i < b.length; i++) {
		System.out.println("After Copying the values "+b[i]);
	}
}
}
