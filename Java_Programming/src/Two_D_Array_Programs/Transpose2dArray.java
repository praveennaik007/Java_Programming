package Two_D_Array_Programs;

import java.util.Scanner;

public class Transpose2dArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the row size ");
	int x=sc.nextInt();
	System.out.println("Enter the col Size ");
	int y=sc.nextInt();
	int a[][]=new int[x][y];
	for (int i = 0; i < a.length; i++) {
		System.out.println("Enter the elements ");
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=sc.nextInt();
		}
	}
	int b[][]=new int[a.length][a[0].length];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			b[j][i]=a[i][j];
		}
		
	}
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b[i].length; j++) {
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j][i]);
		}
		System.out.println();
	}
}
}
