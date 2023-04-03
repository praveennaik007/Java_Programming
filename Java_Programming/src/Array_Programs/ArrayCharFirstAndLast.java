package Array_Programs;

import java.util.Scanner;

public class ArrayCharFirstAndLast {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size ");
	int n=sc.nextInt();
	char a[]=new char[n];
	
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.next().charAt(0);
	}
	boolean rs=false;
	for (int i = 0; i < a.length; i++) {
	rs=true;
	}
	if(true)
	{
		System.out.println(a[0]+" "+a[a.length-1]);
	}
	
}
}
