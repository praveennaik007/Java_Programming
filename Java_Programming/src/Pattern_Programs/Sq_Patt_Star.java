package Pattern_Programs;

import java.util.Scanner;

public class Sq_Patt_Star {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Row ");
	int row=sc.nextInt();
	System.out.println("Enter the column ");
	int col=sc.nextInt();
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
