package Number_Programs;
import java.util.Scanner;

public class StartWithEvenOrNot {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Number ");
	int even=sc.nextInt();
	int rev=0;
	while(even>9)
	{	
	even=even/10;
	
	
	}
	if(rev%2==0)
	{
		System.out.println("even");
	}
	else
	{
		System.out.println("odd");
	}
	
}
}
