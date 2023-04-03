package Number_Programs;
import java.util.Scanner;

public class SwapNumbers {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("ENTER The value ");
	int a=sc.nextInt();
	System.out.println("Enter the value ");
	int b=sc.nextInt();
	int temp=a;
	a=b;
	b=temp;
	System.out.println(" A value is "+a+" B value is "+b);
	
	int c=sc.nextInt();
	int d=sc.nextInt();
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println(" C value is "+c+" D value is "+d);
}
}
