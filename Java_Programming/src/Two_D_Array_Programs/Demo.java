package Two_D_Array_Programs;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the row size ");
	int x=sc.nextInt();
	System.out.println("Enter column size ");
	int y=sc.nextInt();
	double a[][]=new double[x][y];
	for (int i = 0; i <x; i++) {
		System.out.println("Enter the rows");
		for (int j = 0; j < y; j++) {
			a[i][j]=sc.nextInt();
		}
	}
	for (int i = 0; i < x; i++) {
		for (int j = 0; j < y; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}
