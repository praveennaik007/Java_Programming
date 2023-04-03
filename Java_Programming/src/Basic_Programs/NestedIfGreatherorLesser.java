package Basic_Programs;
import java.util.Scanner;

public class NestedIfGreatherorLesser {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value");
	int monkey=sc.nextInt();
	int noofBikes=sc.nextInt();
	if(monkey>60000)
	{
		System.out.println("noofBikes is ");
		if(noofBikes==1)
		{
			System.out.println("Monkey is Sufficient to buy a bike");
			
		}
		else
		{
			System.out.println("Not Sufficient");
		}
	}
	else
	{
		System.out.println("Take loan from bank to buy ");
	}
}
}
