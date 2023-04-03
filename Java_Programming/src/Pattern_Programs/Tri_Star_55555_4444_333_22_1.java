package Pattern_Programs;

import java.util.Scanner;

public class Tri_Star_55555_4444_333_22_1 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int c=sc.nextInt();
	for (int i = c; i >=1; i--) {
		for (int j = 1; j <=i; j++) {
			System.out.print(i+"");
		}
		System.out.println();
	}
}
}
