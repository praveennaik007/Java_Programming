package Number_Programs;
import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int a=sc.nextInt();
	int b=1;
	while(a>0)
	{
		b=b*a;
		System.out.println(a +" "+b);
		a--;	
	}
	int fact=1;
	for (int i = 1; i <=5; i++) {
		fact*=i;
	}
	System.out.println(fact);
}
}
