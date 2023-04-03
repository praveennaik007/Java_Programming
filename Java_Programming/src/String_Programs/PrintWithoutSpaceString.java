package String_Programs;

public class PrintWithoutSpaceString {
public static void main(String[] args) {
	String s=" PRAVEEN KUMAR ";
	System.out.println("Without Space ");
	System.out.println(s.replace(" ", ""));
	System.out.println("Normal Print ");
	System.out.println(s);
	System.out.println("Remove first space last space ");
	System.out.println(s.trim());
	
	System.out.println("To Separate the words ");
	String[] str=s.split(" ");
	for (int i = 0; i < str.length; i++) {
	System.out.println(str[i]);	
	}
	System.out.println("Concatinate ");
	System.out.println(s.concat("Naik"));
	System.out.println(s.toLowerCase());
	System.out.println(s.length());
	String [] st= {"Banglore","Karnataka","Hyderabad"};
	
	for (int i = 0; i < st.length; i++) {
		System.out.println(st[i]);
	}
	
}
}
