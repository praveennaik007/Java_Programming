package Pattern_Programs;

import java.util.Scanner;

public class Tri_Star_12345_1234_123_12_1 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	
	int b=sc.nextInt();
	for (int i = b; i >=1; i--) {
		for (int j = 1; j <=i; j++) {
			System.out.print(j+"");
		}
		System.out.println();
	}
}
}
