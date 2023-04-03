package Number_Programs;
import java.util.Scanner;

public class EvenofN {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int a=sc.nextInt();
	while(a>0)
	{
		if(a%2==0)
		{
			System.out.println(a);
		}
		a--;
	}
	
	//Using for loop
	
	System.out.println();
	int b=10;
	for (int i = 1; i <= b ; i++) {
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
}
}
