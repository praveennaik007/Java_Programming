package Pattern_Programs;
import java.util.Scanner;

public class TriMid_Star_Rev_9s7s5s3s1s {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values ");
	int n=sc.nextInt();
	for (int i = 5; i >=1; i--) {			//*********
		for (int j = 1; j <=n-i; j++) {		// *******
			System.out.print(" ");			//  *****
		}									//   ***
		for (int j = 1; j <=2*i-1; j++) {	//    *
			System.out.print("*");
		}
		System.out.println();
		}
	}
	

}
