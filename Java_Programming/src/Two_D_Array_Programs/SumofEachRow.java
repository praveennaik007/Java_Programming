package Two_D_Array_Programs;

import java.util.Scanner;

public class SumofEachRow {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size 1 ");
	int x=sc.nextInt();
	System.out.println("Enter the size 2 ");
	int y=sc.nextInt();
	int a[][]=new int[x][y];
	
	for (int i = 0; i < x; i++) {
		System.out.println("Enter the row Elements "+i+1);
		for (int j = 0; j < y; j++) {
			a[i][j]=sc.nextInt();
		}
	}
	
	for (int  i= 0;  i< x; i++) {
		int  sum=0;
		for (int j = 0; j < y; j++) {
			sum=sum+a[i][j];
		}
		System.out.print("Row Sum is "+sum+" ");
	}
	System.out.println();
}
}
