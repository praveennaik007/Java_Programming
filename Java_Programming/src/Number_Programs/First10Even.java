package Number_Programs;
import java.util.Scanner;

public class First10Even {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value ");
	int a=sc.nextInt();
	for (int i = 1; i <=a; i++) {
		System.out.println("First "+i+" Even Number is: "+i*2);
	}
	System.out.println();
	int b=1;
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	while(b<=n)
	{
		System.out.println(b*2);
		b++;
	}
	
	
	
}
}
