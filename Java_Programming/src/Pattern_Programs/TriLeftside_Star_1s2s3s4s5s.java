package Pattern_Programs;
import java.util.Scanner;

public class TriLeftside_Star_1s2s3s4s5s {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value ");
	int n=sc.nextInt();
	for (int i = 1; i <=n; i++) {			//*
		for (int j = 1; j <=i; j++) {		//**
			System.out.print("*");			//***
		}									//****
		System.out.println();				//*****
	}	
}
}
