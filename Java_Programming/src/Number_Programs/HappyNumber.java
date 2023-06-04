package Number_Programs;
import java.util.Scanner;

public class HappyNumber {
public static void main(String[] args) {
	//find the sum of the square  of its every digit and
	//repeat that process until the number will be equal to 1.
	//otherwise it is unhappy number or sad number
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int a=sc.nextInt();
//	int a=49;
	while(a>9)
	{
		int sum=0;	
	while(a>0)
	{
		int d=a%10;
		sum+=d*d;
		a/=10;	
	}
	a=sum;
	}
	if(a==1)
	{
		System.out.println("Happy number ");
		
	}
	else if(a<9)
	{
		System.out.println("Sad number ");
	
	}
	
	
	// Using For Loop
	for ( ; true; ) {
		int sum=0;
		for(int i=a;i>0;i=i/10)
		{
			int d=i%10;
			sum+=d*d;
		}
		a=sum;
		if(a==1)
		{
			System.out.println("Happy Number ");
			break;
		}
		else if(a<9)
		{
			System.out.println("Sad Number ");
			break;
		}
	}
//	while(true)
//	{
//		int sum=0;
//		do {
//			int d=a%10;
//			sum=sum+d*d;
//			a/=10;
//		}while(a>0);
//		a=sum;
//		if(a==1 )
//		{
//			System.out.println("Happy Number ");
//			break;
//		}
//		else
//		{
//			System.out.println("Not Happy Number ");
//			break;
//		}
//	}
	
	
}
}
