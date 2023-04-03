package Basic_Programs;
import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value ");
		char c=sc.next().charAt(0);
		if(c>='A'&&c<='Z')
		{
			System.out.println("Upper Case");
		}
		else
		{
			System.out.println("Lower Case");
		}
	}
}
