package Two_D_Array_Programs;

import java.util.Scanner;

public class Demo2 {
public static void main(String[] args) {
	
int a1[][]={{1,2,3},{2,3,4}};
	
	for (int i = 0; i < a1.length; i++) {
		for (int j = 0; j < a1[i].length; j++) {			
			System.out.print(a1[i][j]);
		}	
		System.out.println();
	}
	System.out.println();
	int a2[][]={ {2,3,4},{4,5,6}};
	
	for (int i = 0; i < a2.length; i++) {		
		for (int j = 0; j < a2[i].length; j++) {			
			System.out.print(a2[i][j]);
		}	
		System.out.println();
	}
	System.out.println();
	int a3[][]=new int[a1.length][a1[0].length];
	int sub[][]=new int[a1.length][a1[0].length];
	for (int i = 0; i < a3.length; i++) {
		for (int j = 0; j < a3[i].length; j++) {
			System.out.print(a1[i][j]+a2[i][j]+" ");	
		}
		System.out.println();
	}
	
	for (int i = 0; i < sub.length; i++) {
		for (int j = 0; j < sub[i].length; j++) {
			System.out.print(a2[i][j]-a1[i][j]);
		}
		System.out.println();
	}
}
}
