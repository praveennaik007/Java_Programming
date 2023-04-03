package Pattern_Programs;

import java.util.Scanner;

public class Pirimid_A_ABC_ABCDE {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			//char ch='a';
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <=2*i-1; j++) {
				System.out.print((char)(64+j));
				//ch++;
			}
			System.out.println();
		}
		
		
		
	}
}
