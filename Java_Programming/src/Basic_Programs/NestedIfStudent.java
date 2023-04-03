package Basic_Programs;
import java.util.Scanner;

public class NestedIfStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year : ");
		int year=sc.nextInt();
		System.out.println("Enter the name : ");
		String name=sc.next();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		int sum=a+b+c+d+e;
		System.out.println("Sum is : "+sum);
		int perc=100*sum/500;
		System.out.println("Perc is : "+perc);
		if(year==2)
		{	
		if(perc>=80)
		{
			System.out.println("Distinction");
		}
			else if(perc>=60&&perc<=80)
			{
				System.out.println("First Class");
			}
			else if(perc>=35&&perc<=60)
			{
				System.out.println("Second Class");
			}
			else if(perc<=35)
			{
				System.out.println("Failed");
			}
		}
		else
		{
			System.out.println("Not Student of second year");
		}
	}
}
