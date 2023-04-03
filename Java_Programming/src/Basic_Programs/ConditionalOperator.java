package Basic_Programs;
import java.util.Scanner;

public class ConditionalOperator {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the values");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	String c=a>b?"graterthan":"lessthan";
	System.out.println("C greaterthan is "+c);
	System.out.println("-------------");
	
	Scanner sc1= new Scanner(System.in);
	System.out.println("enter the values");
	int d=sc1.nextInt();
	int e=sc1.nextInt();
	String f=d<e?"lessthan":"greater than";
	System.out.println("F lessthan is "+f);
	System.out.println("-----------");
	
	Scanner sc2= new Scanner(System.in);
	System.out.println("enter the values");
	int g=sc2.nextInt();
	String i=g>0?"positive":"negitive";
	System.out.println("i g is "+i);
	System.out.println("----------");
	
	Scanner sc3= new Scanner(System.in);
	System.out.println("enter the values");
	int j=sc3.nextInt();
	String k=j%2==0?"Even":"Odd";
	System.out.println(k);
}
}
