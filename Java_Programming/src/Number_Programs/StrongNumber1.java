package Number_Programs;

import java.util.Scanner;

public class StrongNumber1 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
//	int n=145;
	int temp=n;
	int sum=0;
	while(n>0)
	{
		
		int fact=1;
		int d=n%10;
		for (int i = 1; i <= d; i++) {
			fact*=i;
		}
		sum+=fact;
		n/=10;
	}
	if(sum==temp)
	{
		System.out.println("Strong number ");
	}
	else
	{
		System.out.println("Not A Strong Number ");
	}
}
}
