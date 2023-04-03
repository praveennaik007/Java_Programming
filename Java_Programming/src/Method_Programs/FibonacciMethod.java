package Method_Programs;

public class FibonacciMethod {
public static void main(String[] args) {
	fibonacci(10);
}
public static void fibonacci(int n)
{
	int a=0;
	int b=1;
	int c=0;
	for (int i = 1; i <=n; i++) {
		System.out.println(a);
		a=b+c;
		b=c;
		c=a;
	}
}
}
