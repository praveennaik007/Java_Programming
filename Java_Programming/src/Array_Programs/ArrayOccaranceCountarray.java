package Array_Programs;

import java.util.Scanner;

public class ArrayOccaranceCountarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		System.out.println("Enter the occurance ");
		int b = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				count++;
			}
		}
		// System.out.println(count);
		if (count > 0) {
			System.out.println(count);
		} else {
			System.out.println("Not occarance");
		}
	}
}
