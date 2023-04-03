package Basic_Programs;
import java.util.Scanner;

public class SwitchCalculator {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your choice "+"1.addition"+"2.subtraction"+"3.division");
	
	System.out.println("enter the value of a ");
	int a=sc.nextInt();
	System.out.println("enter the value of b ");
	int b=sc.nextInt();
	int cal=sc.nextInt();
	switch (cal) {
	case 1:
	{
	
		System.out.println("sum is "+(a+b));
		
		break;
	}
	case 2:
	{
		
		System.out.println("Sub is "+(a-b));
	
	break;
	}
	case 3:
	{
		System.out.println("mul is "+(a/b));
	
	break;
	}
	
	}
}
}
