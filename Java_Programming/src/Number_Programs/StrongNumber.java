package Number_Programs;
import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	int num=sc.nextInt();
	int temp=num;
	int sum=0;
	while(num>0)
	{
		int fact=1;
		int d=num%10;
		for (int i = 1; i <=d; i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
	}
	if(temp==sum)
	{
		System.out.println("Strong number ");
	}
	else
	{
		System.out.println("Not Strong Number ");
	}
}
}
