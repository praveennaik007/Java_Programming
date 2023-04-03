package Basic_Programs;
import java.util.Scanner;

public class NestedIfAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age : ");
		int age=sc.nextInt();
		int weight = sc.nextInt();
		if(age>25)
		{
			System.out.println("check the Weight...");
			
			if(weight>60)
			{
				System.out.println("Eligible for Boxing...");
			}
			else
			{
				System.out.println("Not Eligible...");
			}
		}
		else
		{
			System.out.println("Under age-Not Eligible");
		}
	}
}
