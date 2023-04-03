package Basic_Programs;
import java.util.Scanner;

public class BonusEmployee {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sal");
		int sal=sc.nextInt();
		System.out.println("Enter the Exp ");
		int exp=sc.nextInt();
		if(exp>5)
		{
			int bonus=sal*exp/100;
			int total=sal+bonus;
			System.out.println(total);
		}
		else
			System.out.println("No Experience "+sal);
		
	}
}
