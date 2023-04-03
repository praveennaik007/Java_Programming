package Number_Programs;

import java.util.Scanner;

public class CountNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int a=sc.nextInt();
	int count=0;
	while(a>0)
	{
		a/=10;
		count++;
	}
	System.out.println(count);
}
}
