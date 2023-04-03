package Pattern_Programs;

import java.util.Scanner;

public class Tri_Num_5_54_543_5432_54321 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	for (int i =1; i<=n; i++) {
		int k=5;
		for (int j = n; j >=1; j--) {
			if(j<=i)
			{
			System.out.print(k--+" ");
			}
			else
			{
				System.out.print("  ");
			}			
		}
		System.out.println();
	}
	
	System.out.println("== Another Way ==");
	
	int n1=sc.nextInt();
	for (int i = 1; i<=n1; i++) {
	
		for (int j = 1; j <=n1-i; j++) {
			System.out.print("  ");
		}
		int a=5;
			for (int j2 = 1; j2 <=i; j2++) {
				System.out.print(a--+" ");
				
			
		}
			
		System.out.println();
	}
}
}
