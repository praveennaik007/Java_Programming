package Number_Programs;
import java.util.Scanner;

public class MultiplicationTable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number1 ");
	int a=sc.nextInt();
	System.out.println();
	System.out.println("Enter the number2 ");
	int b=sc.nextInt();
	for (int i = a; i <=b; i++) {
		for (int j = 1; j <=10; j++) {
			int c=i * j;
			
			System.out.println(i+"*"+j+"="+c);
		
		}
		System.out.println();
		
	}
}
}
