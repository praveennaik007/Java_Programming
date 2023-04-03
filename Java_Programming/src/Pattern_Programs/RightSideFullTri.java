package Pattern_Programs;

import java.util.Scanner;

public class RightSideFullTri {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value ");
	int n=sc.nextInt();
	for (int i = 1; i <=n; i++) {
		for (int j =n; j >=1; j--) {
			
		if(j<=i)
		{
			System.out.print("* ");
		}
		else
		{
			System.out.print("  ");
		}
			
		}
		System.out.println();
	}
	for (int i = n; i >=1; i--) {
		for (int j = n; j >=1; j--) {
			if(i>j)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		
		System.out.println();
	}
	
	
}
}
