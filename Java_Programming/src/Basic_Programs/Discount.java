package Basic_Programs;
import java.util.Scanner;

public class Discount {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value ");
	int bill=sc.nextInt();
	if(bill>1000)
	{
		System.out.println("Enter the Quantity ");
		int quantity=sc.nextInt();
		int cost=200;
		int total=(cost*quantity)*10/100;
		System.out.println(total);
		System.out.println((cost*quantity)-total);
		}
	else
	{
		System.out.println("dicount not available "+bill);
	}
}
}
