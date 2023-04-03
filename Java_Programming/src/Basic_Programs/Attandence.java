package Basic_Programs;
import java.util.Scanner;

public class Attandence {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the  classes present");
	double p=sc.nextDouble();
	System.out.println("Enter the  total classes");
	double h=sc.nextDouble();
   double attendence=p/h*100;
	System.out.println(attendence);
		if(attendence<75.0)
		{
		System.out.println("not  allowed to sit int Exam hall");
		}
		else
		{
			System.out.println(" allowed in the exam hall ");
		}

}
}
