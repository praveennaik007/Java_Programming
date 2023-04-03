package Basic_Programs;
import java.util.Scanner;

public class NestedIfGreaterorNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>100)
		{
			System.out.println("Check the number...");
			if(a<200)
			{
				System.out.println("the number is range : "+a);
			}
			else
			{
				System.out.println("not in the range");
			}
		}
		else
		{
			System.out.println("Print the number lesser then 100");
		}
	}
}
