package Number_Programs;
import java.util.Scanner;

public class TechNumber {
public static void main(String[] args) {
//Take the number and count the number of digits and store the value in another variable  
//check the no of digits is even(count%2)and(count/2)
//divide the number/2 and split into two equal parts
//Calculate the sum of both parts and Square the sum 
//check the sum of square is equals to the number if equal it is a Tech number 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	
	int n=sc.nextInt();//123456
	int a=n;
	int count=0;
	int sum=0;
	while(n>0)
	{
		n/=10;	
		count++;
	}
	
	if(count%2==0)
	{
		//System.out.println("even");
		count/=2;
		int pow=1;
		for (int i = 1; i <=count; i++) {
			pow*=10;
		}
		int n1=a%pow;
		int n2=a/pow;
		sum=n1+n2;
		int sq=sum*sum;
		if(sq==a)
		{
			System.out.println("tech number ");
		}
		else
		{
			System.out.println("not a tech number ");
		}
	}
	else
	{
		System.out.println("odd");
	}
}
}
