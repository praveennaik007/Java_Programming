package Array_Programs;

import java.util.Scanner;

public class ArrayRevAnotherWay {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
//	int a[]= {1,2,3,4,5};
	
	int b[]=new int[a.length];
	int temp=0;
	for (int i = a.length-1; i >=0; i--) {
		b[temp++]=a[i];
	}
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]+" ");
	}
	
	
}
}
