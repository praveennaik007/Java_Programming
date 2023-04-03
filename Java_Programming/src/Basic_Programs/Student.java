package Basic_Programs;
import java.util.Scanner;

public class Student {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int perc=sc.nextInt();
	if(35>=perc)
	{
		System.out.println("fail");
	}
	else if(perc>=35&&perc<85)
	{
		System.out.println("First Class");
	}
	else if(perc>=85)
	{
		System.out.println("Distincion");
	}
}
}
