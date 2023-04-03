package Number_Programs;
import java.util.Scanner;

public class CheckAge {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age ");
	int age1=sc.nextInt();//30
	int age2=sc.nextInt();//79
	int age3=sc.nextInt();//24
	
	if(age1>age2&&age1>age3)
	{
		System.out.println("Age1 is Oldest "+age1);
	}
	else if(age2>age3&&age2>age1)
	{
		System.out.println("Age2 is Oladest "+age2);
	}
	else
		System.out.println("Age3 is oldest "+age3);
	if(age1<age2&&age1<age3)
	{
		System.out.println("age1 is youngest "+age1);
	}
	else if(age2<age3&&age2<age1)
	{
		System.out.println("Age2 is Youngest "+age2);
	}
	else
	{
		System.out.println("Age3 is Youngest "+age3);
	}
   
   


}
}
