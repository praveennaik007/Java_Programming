package Number_Programs;

import java.util.Scanner;

public class PrimeNumberRange {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int a=sc.nextInt();
	System.out.println("Enter the last Range ");
	int b=sc.nextInt();
	int j;
	for (int i = a; i <= b; i++) {
		int c=i;
		boolean rs= true;
		for ( j = 2; j < c; j++) {
			if(c%j==0)
			{
				rs=false;
			}
		}
		if(rs==true)
		{
			System.out.println(j);
		}
	}
	
}
}
