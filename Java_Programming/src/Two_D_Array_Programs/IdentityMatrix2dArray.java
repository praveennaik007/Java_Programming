package Two_D_Array_Programs;

import java.util.Scanner;

public class IdentityMatrix2dArray {
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of row of 1st matrix");
		int row = sc.nextInt();
		System.out.println("Enter the number of coloumn of 1st matrix");
		int column = sc.nextInt();
		int [][] arr = new int [row][column];
		
		for(int i = 0 ; i < row ; i++)
		{
			System.out.println("Enter the row "+i+1);
			for(int j = 0 ; j < column ; j++)
			{
				arr [i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < row ; i++)
		{	
			for(int j = 0 ; j < column ; j++)
			{
				System.out.print(arr [i][j]+" ");
			}
			System.out.println();
		}
		
		
		boolean flag = false;
		if(row != column)
		{
			System.out.println("Enetr a square matrix");
		}
		else
		{
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0 ; j < column ; j++)
			{
				if((i == j && arr[i][j] == 1) || (i != j && arr[i][j] == 0))
				{
					flag = true;
				}
				else
				{
					flag = false;
					break;
				}
			}
		}
		}
		if(flag == true)
		{
			System.out.println("Identity Matrix...");
		}
		else
		{
			System.out.println(" Not Identity Matrix...");
		}

	
					

}
}
