package Number_Programs;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("-Even or Odd-");
		int a=10;
		if(a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("Odd");
	
	}
		
		System.out.println();
		System.out.println("-Positive or Negative-");
		System.out.println();
		
		int b=2;
		if(b>=0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("negative");
		}
		
		System.out.println();
		System.out.println("-Alphabet or Number or Special Character-");
		
		System.out.println();
		char c='d';
	
		if(c>='A'&&c<='Z' || c>='a'&&c<='z')
		{
			System.out.println("Alphabet");
		}
		else if(c>='0'&&c<='9')
		{
			System.out.println("number");
		}
		
		else
		{
			System.out.println("special character");
		}
		
		System.out.println();
		System.out.println("-Multiple by 8-");
		System.out.println();
		
		int f=32;
		if(f%8==0)
		{
			System.out.println("multiple Sucessfull");
		}
		else
		{
			System.out.println("not multiple");
		}
		
		System.out.println();
		System.out.println("-Divisible by 6-");
		System.out.println();
		int g=12;
		if(g%6==0);
		{
			System.out.println("Divisible");
		}
		
		
	}
}
