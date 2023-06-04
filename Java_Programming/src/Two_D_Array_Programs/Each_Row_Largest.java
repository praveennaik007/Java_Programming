package Two_D_Array_Programs;

public class Each_Row_Largest {
	public static void main(String[] args) {
		int a[][] = { { 3, 9, 6 }, { 67, 2, 14 }, { 57, 98, 9 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		System.out.println("Each Row Largest Element");
		
		for (int i = 0; i < a.length; i++) {
			int l = 0;
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > l) {
					l = a[i][j];
				}
			}
			System.out.println(l);
		}
	}
}
