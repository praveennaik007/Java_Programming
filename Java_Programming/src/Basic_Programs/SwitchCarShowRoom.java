package Basic_Programs;
import java.util.Scanner;

public class SwitchCarShowRoom {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Choice "+"1.model1"+"2.model2");
	String s=sc.next();
	switch (s) {
	case ("Bmw"):System.out.println("car name bmw\n price is 300000  ");
		
		break;
	case (""):
		{
		System.out.println("x-series");
	
	break;
		}

	default:
	{
		System.out.println("Enter Corret Name ");
	}
		break;
	}
}
}
