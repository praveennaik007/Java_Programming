package String_Programs;

public class MethodsDemo {
public static void main(String[] args) {
	String s="Praveen Naik";
	System.out.println(s.length());
	System.out.println("============");
	System.out.println(s.toUpperCase());
	System.out.println("===========");
	System.out.println(s.toLowerCase());
	System.out.println("=============");
	System.out.println(s.startsWith("p"));
	System.out.println(s.startsWith("P"));
	System.out.println("================");
	System.out.println(s.endsWith("K"));
	System.out.println(s.endsWith("k"));
	System.out.println("==============");
	System.out.println(s.contains("naik"));
	System.out.println(s.contains("Naik"));
	System.out.println("===========");
	System.out.println(s.concat("Mude"));
	System.out.println("===========");
	System.out.println(s.charAt(6));
	System.out.println(s.charAt(8));
	System.out.println("===========");
	System.out.println(s.indexOf("N"));
	System.out.println(s.indexOf("n"));
	System.out.println(s.indexOf("e"));
	System.out.println("=============");
	String s1="java";
	String s2="java";
	String s3="Java";
	System.out.println(s1==s2);
	System.out.println(s2.equals(s3));
	System.out.println(s2.equalsIgnoreCase(s3));
	System.out.println("=============");
	String x="Hello World";
	System.out.println(x.substring(3));
	System.out.println(x.substring(3, 7));
	
	
	
	
	
}
}
