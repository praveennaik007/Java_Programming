package Basic_Programs;
import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter The number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a+b+c>50)
	{
		System.out.println("the sum is greather than");
	}
	else
	{
		System.out.println("the sum is lesser than");
	}
}
}
