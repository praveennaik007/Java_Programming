package Number_Programs;
import java.util.Scanner;

public class RangePrimeNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	
	int sum=0;
	int j=2;
	for (int i = 10; i <=20; i++) {
		int c=i;
		boolean rs=true;
		for ( j= 2; j <c; j++) {
			if(c%j==0)
			{
				rs=false;
			}
		}
		if(rs==true)
		{
			System.out.println(j+" is prime");
		}
	}
	
		
}
}
