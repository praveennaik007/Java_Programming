package Number_Programs;

import java.util.Scanner;

public class First10Odd {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int c=sc.nextInt();
	for (int i = 1; i <=c; i++) {
		System.out.println(i*2-1);
	}
	
	System.out.println();
	//Using While loop
	System.out.println("Enter the number ");
	int k=1;
	int x=sc.nextInt();
	while(k<=x)
	{
		System.out.println(k*2-1);
		k++;
	}
}
}
