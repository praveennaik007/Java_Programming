package Number_Programs;
import java.util.Scanner;

public class SumofN {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number: ");
	int a=sc.nextInt();
	int sum=0;
	while(a>0)
	{
		sum=sum+a;
		a--;	
	}
	System.out.println("Sum is: "+sum);
}
}
