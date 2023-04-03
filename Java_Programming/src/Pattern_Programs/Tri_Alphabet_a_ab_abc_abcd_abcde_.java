package Pattern_Programs;

import java.util.Scanner;

public class Tri_Alphabet_a_ab_abc_abcd_abcde_ {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int n1=sc.nextInt();
	
	for (int i = 1; i<=n1; i++) {
		char ch1='a';
		for (int j = 1; j <=n1-i; j++) {
			System.out.print("  ");
		}
			for (int j2 = 1; j2 <=i; j2++) {
				System.out.print(ch1+" ");
				ch1++;
			
		}
		System.out.println();
	}
}
}
