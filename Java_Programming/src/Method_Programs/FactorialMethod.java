package Method_Programs;

public class FactorialMethod {
public static void main(String[] args) {
	long fact= factorial(5);
	System.out.println(fact);
}
public static long factorial(int n)
{
	int fact=1;
	for (int i = 1; i <=n; i++) {
		fact*=i;
	}
	return fact;
}
}
