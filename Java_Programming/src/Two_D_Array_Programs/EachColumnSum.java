package Two_D_Array_Programs;

import java.util.Scanner;

public class EachColumnSum {
	public static void main(String[] args) {
		
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Row size ");
int x=sc.nextInt();
System.out.println("Enter the Column Size1");
int y=sc.nextInt();
int a[][]=new int[x][y];
for (int i = 0; i < a.length; i++) {
	System.out.println("Enter the row "+i+1);
	for (int j = 0; j < a[i].length; j++) {
		a[i][j]=sc.nextInt();
	}
}

for (int i = 0; i < y; i++) {
	int sum=0;
	for (int j = 0; j <x; j++) {
		sum+=a[j][i];
	}	
	System.out.print(sum+" ");
}

}
}
