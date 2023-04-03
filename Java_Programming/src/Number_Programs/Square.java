package Number_Programs;
import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of Square : ");
		double a=sc.nextDouble();
		double area=a*a;
		double perimeter=4*a;
		System.out.println("perimeter of Squre : "+perimeter);
		System.out.println("side of Squre : "+area);
	}
}
