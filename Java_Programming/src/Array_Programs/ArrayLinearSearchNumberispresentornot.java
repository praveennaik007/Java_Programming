package Array_Programs;

import java.util.Scanner;

public class ArrayLinearSearchNumberispresentornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		boolean rs=false;
		int b=sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if(a[i]==b)
			{
				rs=true;
				
				break;
			}
		}
		if(rs)
		{
			System.out.println("present");
		}
		else
			System.out.println("no");
	}
}
