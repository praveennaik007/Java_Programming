package Number_Programs;
import java.util.Scanner;

public class FactorsSum {
public static void main(String[] args) {
	//sum of factors of the number 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	int num=sc.nextInt();
	int sum=0;
	for (int i = 1; i <=num; i++) {
		if(num%i==0)
		{
			sum=sum+i;
		}	
		
	}
	System.out.println(sum);
}
}
