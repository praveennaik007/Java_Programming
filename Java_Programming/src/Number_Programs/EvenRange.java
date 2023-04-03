package Number_Programs;

import java.util.Scanner;

public class EvenRange {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the 1st number ");
	int a=sc.nextInt();
	System.out.println("Enter the Range number ");
	int b=sc.nextInt();
	for (int i = a; i <= b; i++) {
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
	//Using While loop
	
	System.out.println();
	int x=10;
	int y=20;
	while(x<=y)
	{
		if(x%2==0)
		{
			System.out.println(x);
		}
		x++;
		
	}
}
}
