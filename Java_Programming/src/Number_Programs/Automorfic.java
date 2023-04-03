
package Number_Programs;
import java.util.Scanner;

public class Automorfic {
public static void main(String[] args) {
//square the given number and do sum the result is equal to the number itself 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int a=sc.nextInt();
	int sq=a*a;
	boolean rs=true;
	while(a>0)
	{
		if(a%10==sq%10)
		{
			a/=10;
			sq/=10;
			
		}
		else
		{
			rs=false;
			break;
		}
	}
	if(rs==true)
	{
		System.out.println("Automorfic ");
		
	}
	else
	{
	System.out.println("Not A Automorfic ");
	}
}
}
