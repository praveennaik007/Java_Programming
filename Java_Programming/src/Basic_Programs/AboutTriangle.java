package Basic_Programs;
import java.util.Scanner;

public class AboutTriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Value ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a==b&&b==c&&c==a)
	{
		System.out.println("Equilateral");
	}
	else if(a==b||b==c||a==c)
	{
		System.out.println("Isoseles");
	}
	else
	System.out.println("Scalene");
	}
}
