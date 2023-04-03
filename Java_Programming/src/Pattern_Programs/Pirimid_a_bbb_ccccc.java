package Pattern_Programs;

import java.util.Scanner;

public class Pirimid_a_bbb_ccccc {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		char ch='a';
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <=2*i-1; j++) {
				System.out.print(ch);
				
			}
			ch++;
			System.out.println();
		}
		
		
		
	}
}
