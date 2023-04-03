package Basic_Programs;
import java.util.Scanner;

public class EmployeeService {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age");
	int age=sc.nextInt();
	if(age>=20&&age<=60)
	{
		System.out.println("Enter the sex M/F ");
		char c=sc.next().charAt(0);
		System.out.println("Enter the marital status Y/N ");
		char ch=sc.next().charAt(0);
		if(c=='F')
		{
			System.out.println("Work in Arban Areas ");
		}
		else if(c=='M'&&age>=20&&age<=40)
		{
			System.out.println("Work in Rural Areas ");
		}
		else if(c=='M'&&age>=40&&age<=60)
		{
			System.out.println("Work in urban Areas");
		}
		
		else
		{
			System.out.println("Error");
		}
	}
}
}
