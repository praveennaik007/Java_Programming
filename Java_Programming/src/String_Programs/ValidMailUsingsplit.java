package String_Programs;

import java.util.Scanner;

public class ValidMailUsingsplit {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter gmail");
			String s = sc.next();

			if (s.contains("@")) {
				String[] a = s.split("@");
				if (a.length > 2) {

					String m = "@gmail.com";
					if (s.equals(m) || a[1] == null) {
						System.out.println("first half should not be empty");
					} else {
						if (a[a.length - 1].equals("gmail.com") || a[a.length - 1].equals("gmail.in")
								|| a[a.length - 1].equals("gmail.org")) {
							System.out.println("correct gmail");
						} else {
							System.out.println("shuold be in this form @gmail.com ");
						}
					}
				}

				else {

					String m = "@gmail.com";
					if (s.equals(m) || a[1] == null) {
						System.out.println("first half should not be empty");
					} else {
						if (a[1].equals("gmail.com") || a[1].equals("gmail.in") || a[1].equals("gmail.org")) {
							System.out.println("correct gmail");
						} else {
							System.out.println("shuold be in this form @gmail.com ");
						}
					}
				}

			} else {
				System.out.println("this is invalid email no @ symbole");
			}
		}
	}
}
