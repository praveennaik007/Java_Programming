package Array_Programs;

import java.util.Scanner;

public class ArrayCube {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	for (int i = 0; i < a.length; i++) {
		int cube=a[i]*a[i]*a[i];
		System.out.println(cube);
	}
	
}
}
