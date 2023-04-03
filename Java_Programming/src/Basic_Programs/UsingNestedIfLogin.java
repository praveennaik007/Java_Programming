package Basic_Programs;
import java.util.Scanner;

public class UsingNestedIfLogin {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter user name : ");
	int name=sc.nextInt();
	System.out.println("enter password : ");
	int password = sc.nextInt();
	
	if(name==1234)
	{
		System.out.println("Check Password...");
		if(password==4567)
		{
			System.out.println("Login Successfull...");
		}
		else
		{
			System.out.println("Login failed...");
		}
	}
	else
	{
		System.out.println("enter valid user name...");
	}
}
}
