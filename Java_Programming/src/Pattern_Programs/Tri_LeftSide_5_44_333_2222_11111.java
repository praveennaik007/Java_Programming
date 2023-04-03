package Pattern_Programs;

import java.util.Scanner;

public class Tri_LeftSide_5_44_333_2222_11111 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number ");
	int n=sc.nextInt();
	for (int i = n; i>=1; i--) {
		for (int j =n; j >=i; j--) {
			System.out.print(i+" ");	
		}
		System.out.println();
	}
}
}
