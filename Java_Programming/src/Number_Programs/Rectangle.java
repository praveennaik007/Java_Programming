package Number_Programs;
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the area of rectangle : ");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double area=l*b;
		double perimeter=2*l+b;
		System.out.println("perimeter of rectangle : "+perimeter);
		System.out.println("area of Rectangle : "+area);
	}
}
