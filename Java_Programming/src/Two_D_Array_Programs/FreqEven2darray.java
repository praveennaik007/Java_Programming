package Two_D_Array_Programs;

import java.util.Scanner;

public class FreqEven2darray {
public static void main(String[] args) {
	//int a[][]= {{4,5,6,7},{2,3,8,9},{1,4,8,3}};
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the row size ");
	int x=sc.nextInt();
	System.out.println("Enter the col size ");
	int y=sc.nextInt();
	int a[][]= new int[x][y];
	for (int i = 0; i < a.length; i++) {
		System.out.println("Enter the elements ");
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=sc.nextInt();
		}
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			if(a[i][j]%2==0)
			{
				System.out.print("Even "+a[i][j]+" ");
			}
		}
		System.out.println();
	}
	
	System.out.println();
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			if(a[i][j]%2!=0)
			{
				System.out.print("Odd "+a[i][j]+" ");
			}
		}
		System.out.println();
	}
}
}
