package Pattern_Programs;

import java.util.Scanner;

public class Tri_Arrow_Star {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==1||j==1||i+j==n+1||i==j)
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
