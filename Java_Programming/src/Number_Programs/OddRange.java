package Number_Programs;
import java.util.Scanner;

public class OddRange {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Starting Range ");
	int a=sc.nextInt();
	System.out.println("Enter the Ending Range ");
	int b=sc.nextInt();
	for (int i = a; i <=b; i++) {
		if(i%2!=0)
		{
			System.out.println(i);
		}
	}
	
	System.out.println();
	//Using While Loop
	System.out.println("Enter the Starting Range ");
	int x=sc.nextInt();
	System.out.println("Enter the Ending range ");
	int y=sc.nextInt();
	while(x<=y)
	{
		if(x%2!=0)
		{
			System.out.println(x);
		}
		x++;
	}
}
}
