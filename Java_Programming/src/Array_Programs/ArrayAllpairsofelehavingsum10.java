package Array_Programs;

import java.util.Scanner;

public class ArrayAllpairsofelehavingsum10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the size");
	int x=sc.nextInt();
	int b[]=new int[x];
	for (int i = 0; i < b.length; i++) {
		b[i]=sc.nextInt();
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < b.length; j++) {
			if(a[i]+b[j]==10)
			{
				System.out.println(a[i]+"+"+a[j]+"=="+"10");
			
			}
			
		}
	}
}
}
