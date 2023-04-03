package Array_Programs;

import java.util.Scanner;
//Bubble Sort
public class ArrayBubbleSort {
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();//3,2,1,4,5
	}	
	System.out.println();
	for (int i = 0; i < a.length-1; i++) {
		for (int j = 0; j < a.length-1-i; j++) {
			if(a[j]>a[j+1])
					{
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
	
	System.out.println("== Another Way ==");
	for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if(a[i]>a[j])
		{
//			a[i]=a[i]+a[j];
//			a[j]=a[i]-a[j];
//			a[i]=a[i]-a[j];
			
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
}
}
