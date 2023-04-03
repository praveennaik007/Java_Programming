package Pattern_Programs;

import java.util.Scanner;

public class Tri_Alphabet_A_AB_ABC_ABCD_ABCDE {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	
	for (int i =1; i<=n; i++) {
		char ch='A';
		for (int j = 1; j <=n; j++) {
			if(j<=n-i)
			{
			System.out.print("  ");
			}
			else
			{
				System.out.print(ch+" ");	
				ch++;
			}	
		}
		System.out.println();
	}	
}
}
