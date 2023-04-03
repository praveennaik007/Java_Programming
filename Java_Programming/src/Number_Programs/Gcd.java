package Number_Programs;
import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		//Greatest common factor 
		//Take two inputs and do factors of those inputs 
		//Select the common factors and the greatest number is gcd.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1 ");
		int num1=sc.nextInt();
		System.out.println("Enter the num2 ");
		int num2=sc.nextInt();
		int gcd=0;
		for (int i = 1; i<=num1&&i<=num2; i++) {
			if(num1%i==0&&num2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println(gcd);
	}
}
