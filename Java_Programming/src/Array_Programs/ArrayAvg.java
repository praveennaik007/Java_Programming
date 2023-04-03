package Array_Programs;

import java.util.Scanner;

public class ArrayAvg {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size ");
	int n=sc.nextInt();
	double a[]=new double[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextDouble();
	}
	double sum=0;
	for (int i = 0; i < a.length; i++) {
		sum+=a[i];
		
	}
	System.out.println(sum/n);
}
}
