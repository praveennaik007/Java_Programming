package Pattern_Programs;

import java.util.Scanner;

public class AlphaplusnumPatt {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();//char ch='A'; 
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==j)
				{
					System.out.print((char)(64+j));
					
				}
				else
				{
					System.out.print(i+j);
				}
				
			}
			System.out.println();
		}
		
	}
}
