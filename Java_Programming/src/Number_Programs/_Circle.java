package Number_Programs;
import java.util.Scanner;

public class _Circle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the area of circle : ");
		double area=sc.nextDouble();
		double r=sc.nextDouble();
		double area1=3.14*r*r;
		double perimeter=2*3.14*r;
		System.out.println("perimeter of rectangle : "+perimeter);
		System.out.println("area of Rectangle : "+area1);
	}
}
