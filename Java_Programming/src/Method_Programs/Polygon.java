package Method_Programs;

import java.util.Scanner;

public class Polygon {
public static void main(String[] args) {
	
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Calculate "+"1.rectangle"+"2.square"+"3.circle"+"4.trangle");
	int n=sc.nextInt();
	switch (n) {
	case 1:System.out.println(rectangle(4, 5));
		
		break;
	case 2:System.out.println(square(5));
	
	break;
	case 3:System.out.println(circle(2));
	
	break;
	case 4:System.out.println(triangle(10, 5));
	
	break;

	default:System.out.println("Enter the valid number");
		break;
	}
//	int a=rectangle(5, 5);
//	System.out.println(a);
//	int b=square(5);
//	System.out.println(b);
//	double c=circle(4);
//	System.out.println(c);
//	int d=triangle(5, 3);
//	System.out.println(d);
	
}
public static int rectangle(int a, int b)
{
	int area=a*b;
	return area;	
}
	public static int square(int a)
	{
		int area=a*a;
		return area;
	}
	public static double circle(double a)
	{
		double area=3.14*a*a;
		return area;	
	}		
	public static int triangle(int a, int b)
	{
		int area=1/2*a*b;
		return area;
		
	}
				
}
