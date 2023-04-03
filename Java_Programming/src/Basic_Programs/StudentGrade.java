package Basic_Programs;
import java.util.Scanner;

public class StudentGrade {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the id");
	int id=sc.nextInt();
	System.out.println("Enter the marks name");
	String s=sc.next();
	System.out.println("Enter the marks English");
	int a=sc.nextInt();
	System.out.println("Enter the marks maths");
	int b=sc.nextInt();
	System.out.println("Enter the marks Physis");
	int c=sc.nextInt();
	System.out.println("Enter the marks Chemistry");
	int d=sc.nextInt();
	System.out.println("Enter the marks Telugu");
	int e=sc.nextInt();
	
	//System.out.println("The perc is");
	
	int sum=a+b+c+d+e;
	System.out.println("Sum is "+sum);
	int perc=100*sum/500;
	System.out.println("The perc is "+perc);
	
	if(perc>90&&perc<100)
	{
		System.out.println("A Grade");
	}
	else if(perc>80&&perc<90)
	{
		System.out.println("B Grade");
	}
	else if(perc>60&&perc<80)
	{
		System.out.println("C Grade");
	}
}
}
