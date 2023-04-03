package Number_Programs;
import java.util.Scanner;

public class ContFactors {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int a=sc.nextInt();
	int count=0;
	int fact=1;
	for (int i = 1; i <=a; i++) {
		if(a%i==0)
		{
		count++;
//		System.out.println(count);
		}
	}
	System.out.println(count);
	System.out.println("Enter the number");
	int x=1;
	int y=sc.nextInt();
	int count1=0;
	while(x<=y)
	{
		if(y%x==0)
		{
			count1++;	
		}
		x++;
	}
	System.out.println(count);
}
}
