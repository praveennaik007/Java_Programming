package Number_Programs;
import java.util.Scanner;

public class CheckLengthAndBredth {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length : ");
	int length=sc.nextInt();
	System.out.println("enter the breadth : ");
	int breadth=sc.nextInt();
	if(length==breadth)
	{
		System.out.println("Square is: ");
	}
	else
	{
		System.out.println("not Square");
	}
}
}
