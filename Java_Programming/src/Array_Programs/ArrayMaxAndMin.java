package Array_Programs;

import java.util.Scanner;

public class ArrayMaxAndMin {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the elements");
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	int max=a[0];
	for (int i = 0; i < a.length; i++) {
		if(a[i]>max);
		max=a[i];	
	}
	System.out.println(max);
	
	System.out.println();
	int min=a[0];
	for (int i = 0; i < a.length; i++) {
		if(a[i]<min)
		min=a[i];	
	}
	System.out.println(min);
	
	
	
	
}
}
