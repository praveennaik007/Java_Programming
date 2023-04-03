package Number_Programs;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int p=sc.nextInt();
		int temp=p;
		int reverse=0;
		
		while(p>0)
		{
			int x=p%10;
			reverse=10*reverse+x;
			p=p/10;	
		}
		
		if(temp==reverse)
		{
			System.out.println("palindrome ");
		}
		else
		{
			System.out.println("not a palindrome ");
		}	
	}
}
