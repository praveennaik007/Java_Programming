package Number_Programs;
import java.util.Scanner;

public class GreatestTwovalues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input 1 : ");
		int a=sc.nextInt();
		System.out.println("Enter input 2 : ");
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("Greatest is a= "+a);
		}
		else
		{
		System.out.println("Greatest is b= "+b);
		}
	}
}
