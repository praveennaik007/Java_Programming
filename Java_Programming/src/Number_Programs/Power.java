package Number_Programs;
import java.util.Scanner;

public class Power {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int num=sc.nextInt();
	System.out.println("Enter the power ");
	int pow=sc.nextInt();
	int prod=1;
	while(pow>0)
	{
		prod=prod*num;
		pow--;
	}
	System.out.println(prod);
	
	System.out.println();
	//Using forLoop
	System.out.println("Enter the number ");
	int num1=sc.nextInt();
	System.out.println("Enter the power ");
	int pow1=sc.nextInt();
	int prod1=1;
	for (int i = 1; i <=pow1; i++) {
		prod1=prod1*num1;
	}
	System.out.println(prod1);
}
}
