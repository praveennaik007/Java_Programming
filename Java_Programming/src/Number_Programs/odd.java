package Number_Programs;
import java.util.Scanner;

public class odd {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int a=sc.nextInt();//20
	while(a>0)
	{
		if(a%2!=0)
		{
			System.out.println(a+"");
			
		}
		a--;
	}
	
	System.out.println();
	//Using for loop
	System.out.println("Enter the number ");
	int b=sc.nextInt();
	for (int i = 0; i < b; i++) {
	if(i%2!=0)
	{
		System.out.println(i);
	}
	}
}
}
