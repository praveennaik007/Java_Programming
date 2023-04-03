package Pattern_Programs;

public class Tri_Alphabet_A_BC_DEF_GHIJ_KLMNO {
public static void main(String[] args) {
	char ch2='A';
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(ch2);
			ch2++;
		}
		System.out.println();
	}
}
}
