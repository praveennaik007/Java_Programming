package String_Programs;

import java.util.Scanner;

public class MethodUserDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=sc.nextLine();
	System.out.println(s.toUpperCase());
	System.out.println("===========");
	System.out.println(s.toLowerCase());
	
	System.out.println("=============");
	System.out.println("Enter the name ");
	String s6=sc.nextLine();
	System.out.println(s6.length());
	
	String s1="java";
	System.out.println(s1.toUpperCase());
	System.out.println("==========");
	
	System.out.println("==============");
	
	String s3="TEST YENTRA";
	System.out.println(s3.toLowerCase());
	
	System.out.println("==========");
	
	System.out.println("Enter the name ");
	String s4=sc.nextLine();
	System.out.println(s4.indexOf(sc.next()));
	
	System.out.println("===========");
	
	String s5="Test Program";
	System.out.println(s5.indexOf("P"));
	System.out.println("===========");
	
	
	
	System.out.println("===========");
	String s7="data Programs";
	System.out.println(s7.length());
	System.out.println("=========");
	
	String s9="Yentra";
	System.out.println(s9.substring(1));
	System.out.println("=========");
	
	
	System.out.println("============");
	
	
	
	System.out.println("============");
	
	System.out.println("======");
	String s15="Bangalore";
	System.out.println(s15.contains("gal"));
	System.out.println("===========");
	String s16="Java Programs";
	System.out.println(s16.endsWith("Programs"));
	System.out.println("============");
	
	System.out.println("==========");
	
	String s19="Harison";
	System.out.println(s19.isEmpty());
	
	
	
	
}
}
