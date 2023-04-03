package Pattern_Programs;
import java.util.Scanner;

public class Tri_Num_1_22_333_4444_55555 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	for (int i = 1; i<=n; i++) {
		for (int j = 1; j <=n; j++) {
			if(j<=n-i)
			{
			System.out.print("  ");
			}
			else
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	System.out.println("== Another Way ==");
	
	int n1=sc.nextInt();
	for (int i = 1; i<=n1; i++) {
		for (int j = 1; j <=n1-i; j++) {
			System.out.print("  ");
		}
			for (int j2 = 1; j2 <=i; j2++) {
				System.out.print(i+" ");
			
		}
		System.out.println();
	}
}
}
