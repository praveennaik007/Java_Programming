package Pattern_Programs;

public class PatternDemo {
public static void main(String[] args) {
	System.out.print("*");
	System.out.println();
	
	int a=5;
	for (int i = 1; i <=a; i++) {
		System.out.print("*");
	}
	System.out.println();
	
	int b=4;
	for (int i = 1; i <=6; i++) {
		System.out.print(b);
	}
	System.out.println();
	
	int c=6;
	for (int i = 1; i <=c; i++) {
		if(i%2==0)
		{
			System.out.print("0");
		}
		else
		{
			System.out.print("1");
		}
	}
	
}
}
