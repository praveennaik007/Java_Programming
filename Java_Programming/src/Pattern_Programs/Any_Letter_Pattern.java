package Pattern_Programs;

import java.util.Scanner;

public class Any_Letter_Pattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(j==1||i==1&&j<=n/2+1||i==n/2+1&&j<=n/2+1||j==n/2+1&&i<=n/2+1)				
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
		
		System.out.println();
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==1&&j<=n/2+1||j==1||j==n/2+1&&i<=n/2+1||i-j==n/2)				
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
		System.out.println();
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==1||j==1||j==n||i==n/2+1)				
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
		
System.out.println();
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(j==1&&i<=n/2+1||i-j==n/2||i+j==n+n/2+1||j==n&&i<=n/2+1)				
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
		
		
System.out.println();
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==1||j==1||i==n/2+1||i==n)				
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
		
		System.out.println();
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==1||j==1||i==n/2+1||i==n)				
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
		
System.out.println();
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(j==1||j==n||j==i)				
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
