package Pattern_Programs;

public class Tri_LeftSide_1To15 {
public static void main(String[] args) {
	int count=1;
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(count+" ");
			count++;
		}
		System.out.println();
	}
}
}
