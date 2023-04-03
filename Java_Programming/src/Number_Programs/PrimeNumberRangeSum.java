package Number_Programs;
import java.util.Scanner;

public class PrimeNumberRangeSum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	
	int sum=0;
	int j=2;
	for (int i = 40; i <=50; i++) {
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
			sum=sum+c;
		}
	}
	
	System.out.println(sum);
}
}
