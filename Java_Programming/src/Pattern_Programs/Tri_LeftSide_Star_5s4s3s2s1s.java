package Pattern_Programs;

import java.util.Scanner;

public class Tri_LeftSide_Star_5s4s3s2s1s {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	
	int a=sc.nextInt();
	for (int i = a; i >=1; i--) {
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
