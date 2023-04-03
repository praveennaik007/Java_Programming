package Number_Programs;
import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();	
	long rev=0;
	
	while(a!=0)
	{
		int d=a%10;
		rev=10*rev+d;
		a=a/10;
	}
	System.out.println(rev);
	
	//System.out.println("Palindrome...");
	
	
	
	

	System.out.println("===============product============");
	
	int b=sc.nextInt();
	int prod=1;
	while(b!=0)
	{
		prod=prod*b;
		b--;
	}
	System.out.println(prod);
	
	
	
	
	
	
	
	
	
	
	System.out.println("===========prime number===========");
	
	
	
	int e=sc.nextInt();
	int d=2;
	while(e>0)
	{
		if(e%d==1)
		{
			System.out.println("prime");
			
		}
		else
		{
			System.out.println("not prime");	
		}
		break;
	}
	
	
}
}
