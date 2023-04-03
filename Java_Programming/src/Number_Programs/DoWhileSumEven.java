package Number_Programs;
import java.util.Scanner;

public class DoWhileSumEven {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int a=20;
	int sum=0;
	do {
		
		if(a%2==0)
		{
			System.out.println(a);
			sum=sum+a;	
		}
		a--;	
	}
	while(a>0);
	System.out.println(sum);
	
	
	System.out.println("====Character======");
	
	char c='A';
	char d='Z';
	do {
		int b=c;
		c++;
		System.out.println(b);
	}
	while(c<=d);
	
	System.out.println("=====Range 60 to 100=====");
	int x=60;
	
	do {
		if(x>60)
		{
		System.out.println(x);
		}
		x++;
	}
	while(x<100);
	
	System.out.println();
	System.out.println("Range 500 to 400");
	
	int s=500;
	do {
			System.out.println(s);
		    s--;
	} while (s>400);
	
}
}
