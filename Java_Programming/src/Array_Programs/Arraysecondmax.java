package Array_Programs;

import java.util.Scanner;

public class Arraysecondmax {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int secondmax=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max);
			secondmax=max;
			max=a[i];	
			
		}
		System.out.println(secondmax);
		
	}		
}
