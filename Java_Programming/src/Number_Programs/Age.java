package Number_Programs;
import java.util.Scanner;

public class Age {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value");
	int age=sc.nextInt();
	if(age>=18)
	{
		System.out.println("Eligible to vote");
	}
	else
	{
		System.out.println("Not eligibles");
	}
}
}
