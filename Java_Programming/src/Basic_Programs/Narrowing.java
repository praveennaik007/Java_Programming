package Basic_Programs;

public class Narrowing {
public static void main(String[] args) {
	
	short a=30;
	byte b=(byte)a;
	System.out.println(a);
	
	double d=23.45;
	
	float f=(float)d;
	System.out.println(f);
	int n=100;
	char c=(char)n;
		System.out.println(c);
	
		double d1=10.325;
		int n1=(int)d1;
		System.out.println(n1);
		int n2=68;
		char c1=(char)n2;
		System.out.println(c1);
		
	System.out.println("");
		int vicky=500;
	float d2=13.5f;
		double d4=vicky/13.5;
		System.out.println(d4);
		
		int x=23;
		byte v=(byte)x;
		System.out.println(v);
		
}
}
