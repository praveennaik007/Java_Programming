package Two_D_Array_Programs;

import java.util.Scanner;

public class UpperTriangle2dArray {
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
	
	
	for (int i = 0; i < x; i++) {
		for (int j = 0; j < y; j++) {
			if(i>j)
			{
				System.out.print("0");
			}
			else
			{
				System.out.print(a[i][j]);
			}
		}
		System.out.println();
	}
}
}
