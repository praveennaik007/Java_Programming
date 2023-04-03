package Number_Programs;
import java.util.Scanner;

public class FibonacciNthTerm {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value ");
	int n=sc.nextInt();
	int a=0;
	int b=1;
	int c=0;
	for (int i = 1; i <=n; i++) {
		if(i==n)
		{
			System.out.println(a);
		}

		c=a+b;
		a=b;
		b=c;
		}
	
}
}
