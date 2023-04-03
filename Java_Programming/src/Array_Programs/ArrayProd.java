package Array_Programs;

import java.util.Scanner;

public class ArrayProd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	int prod=1;
	for (int i = 0; i < a.length; i++) {
		prod*=a[i];
	}
	System.out.println(prod);
}
}
