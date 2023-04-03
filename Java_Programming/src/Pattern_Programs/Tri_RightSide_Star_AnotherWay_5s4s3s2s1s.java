package Pattern_Programs;

import java.util.Scanner;

public class Tri_RightSide_Star_AnotherWay_5s4s3s2s1s {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	for (int i = n; i >=1; i--) {
		for (int j = 1; j <=n-i; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
