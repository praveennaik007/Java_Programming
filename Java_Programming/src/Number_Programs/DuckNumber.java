package Number_Programs;

import java.util.Scanner;

public class DuckNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
//	System.out.println("Enter the number ");
//	int n=sc.nextInt();
	int n=01002;
	int count=0;
	while(n>0)
	{
		int d=n%10;
		if(d==0)
		{
			count++;
		}
		n/=10;    	  
	}
	
	
	if(count>0)
	{
		System.out.println("Duck Number ");
	}
	else
	{
		System.out.println("Not Duck");
	}
	
	
      

}
}
