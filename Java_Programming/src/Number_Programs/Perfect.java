package Number_Programs;
import java.util.Scanner;

public class Perfect {
public static void main(String[] args) {
	//The sum of factors of the number exclude the given number is equal to the number itself
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	int num=sc.nextInt();
	int sum=0;
	for (int i = 1; i <num; i++) {
		if(num%i==0)
		{
			sum=sum+i;
		}		
	}
	if(sum==num)
	{
	System.out.println("Perfect ");
}
	else
	{
		System.out.println("Not Perfect ");
	}
}
}
