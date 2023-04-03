package Basic_Programs;
import java.util.Scanner;

public class CricketUsingElseIf {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the value");
		
		int a=sc.nextInt();
		
		if(a>1&&a<=25)
		{
			System.out.println("Bad Performance");
		}
		else if(a>25&&a<50)
		{
			System.out.println("Good Perfarmance");
		}
		else if(a>=50&&a<=80)
		{
			System.out.println("Very Good Performance");
		}
		else if(a>80)
		{
			System.out.println("Amazing performance");
		}
	}
}
