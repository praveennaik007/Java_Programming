package Two_D_Array_Programs;

public class Each_col_Largest {
	public static void main(String[] args) {
		//int a[][] = { { 1, 9, 3 }, { 4, 7, 6 }, { 5, 8, 2 } };
		int a[][] = { { 3, 9, 6 }, { 67, 2, 14 }, { 57, 98, 9 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		System.out.println("Each Col Largest Element");
		
		for (int i = 0; i < a.length; i++) {
			int l = 0;
			for (int j = 0; j < a[i].length; j++) {
				if (a[j][i] > l) {
					l = a[j][i];
				}
			}
			System.out.println("" + l);
		}
	}
}
