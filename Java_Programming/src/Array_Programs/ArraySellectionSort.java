package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySellectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}

			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		System.out.println(Arrays.toString(a));
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
	}
}
