package String_Programs;

import java.util.Arrays;

public class StringsplitMethod {
public static void main(String[] args) {
	String s="06-03-2023";
	String s1[]=s.split("-");
	System.out.println(Arrays.toString(s1));
	for (int i = 0; i < s1.length; i++) {
		System.out.println(s1[i]);
	}
}
}
