package Pattern_Programs;

import java.util.Scanner;

public class Tri_Star_11111_2222_333_44_5 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int d=sc.nextInt();
	int x=1;
	for (int i = d; i >=1; i--) {
		for (int j = 1; j <=i; j++) {
			System.out.print(x+"");	
		}
		x++;
		System.out.println();
	}
}
}
