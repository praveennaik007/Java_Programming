package Pattern_Programs;

import java.util.Scanner;

public class Tri_RighttSide_Star_5s4s3s2s1s {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number ");
	int a=sc.nextInt();
	for(int i=1;i<=a;i++) {
		for (int j = 1; j <i; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=a+1-i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
}
}
