package Array_Programs;

import java.util.Scanner;

public class ArrayDistinctElement {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size ");
	int n=sc.nextInt();
	int [] a=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}	
	for (int i = 0; i < a.length; i++) {
		int count=0;
		for (int j = 0; j < a.length; j++) {
			if(a[i]==a[j])
			{
				count++;
			}	
			}
		if(count==1)
		{
			System.out.println(a[i]);
		}
	}
	
	
}
}
