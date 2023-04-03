package Basic_Programs;

public class Conditional_Operator {
public static void main(String[] args) {
	int a=100;
	int b=500;
	int c=700;
	int d=400;
	int f=a>b&&a>c&&a>d?a:b>c&&b>d?b:c>d?c:d;
	System.out.println(f);
}
}
