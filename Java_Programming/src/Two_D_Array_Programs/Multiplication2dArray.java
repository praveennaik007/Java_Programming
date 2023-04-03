package Two_D_Array_Programs;

public class Multiplication2dArray {
public static void main(String[] args) {
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int b[][]= {{3,2,1},{6,5,4},{5,7,9}};
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println();
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b[i].length; j++) {
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println();
	int mul[][]=new int [a.length][a[0].length];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			for (int k = 0; k < a[i].length; k++) {
				mul[i][j]+=a[i][k]*b[k][j];
			}
		}	
	}
	for (int i = 0; i < mul.length; i++) {
		for (int j = 0; j < mul[i].length; j++) {
			System.out.print(mul[i][j]+" ");
		}
		System.out.println();
	}
}
}
