package Number_Programs;
import java.util.Scanner;

public class Phythogours {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a*a+b*b==c*c||a*a+c*c==b*b||c*c+b*b==a*a)
	{
		System.out.println("Phythogurus");
	}
	else 
	{
		System.out.println("not Phythogurus");
	}
}
}
