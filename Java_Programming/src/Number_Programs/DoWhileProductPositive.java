package Number_Programs;
import java.util.Scanner;

public class DoWhileProductPositive {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();//5
	int b=sc.nextInt();
	
	do {
		
		System.out.println(a*b);
	}
	while(a>0);
	
	char ch='a';
	int i=ch;
	System.out.println(ch);
}
}
