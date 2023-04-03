package Number_Programs;
import java.util.Scanner;

public class CompositeNumber {
public static void main(String[] args) {
	//prime number opposite is composite
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	int a=sc.nextInt();

	for (int i = 2; i <=a; i++) {
		if(a==2)
		{
			System.out.println("Prime number");
		}
		else if(a%i==0)
		{
			System.out.println("Composite number ");
			break;
		}
		else
		{
			System.out.println("Prime number ");
			break;
		}
	}
}
}
