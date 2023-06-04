package Number_Programs;
import java.util.Scanner;

public class ArmStrongNumber {
public static void main(String[] args) {
	//count the number and sum of power of every digit
	//is equal to the number itself
	Scanner sc= new Scanner(System.in);
for (int i = 100; i <=200 ; i++) {
		
	//System.out.println("Enter the number ");
	
	//int  a=sc.nextInt();
	int a=i;
	int count=0, temp=a;
	while(a>0)
	{
		a/=10;
		count++;
	}
	a=temp;
	
	int sum=0;
	while(a>0)
	{
		int fact=1;
		int rem=a%10;		
							//3
		for (int j = 1; j <=count; j++) {
			fact=fact*rem;
		}
		sum+=fact;
		//System.out.println(sum);
		a/=10;
		
	}
	if(temp==sum)
	{
	System.out.println("ArmStrong "+sum);
	}
	else
	{
		System.out.println("Not Armstrong ");
	}
	
}

}	
	
}
