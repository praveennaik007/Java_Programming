package Array_Programs;

import java.util.Scanner;

public class ArrayFindCommonElement {
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 6 };
		int[] b = { 2, 4, 3, 7, 8, 2, 4, 4, 2 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					count++;
				}
			}
			if (count >= 1) {
				System.out.println(a[i]);
			}
		}
	}
}
