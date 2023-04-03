package Method_Programs;

public class ReturnTypeDemo {
public static void main(String[] args) {
	System.out.println(add(20, 40));
	System.out.println(add(20.5, 60.5));
	System.out.println(add(50l, 60l));
	System.out.println(add('a', 'c'));
	//System.out.println(add("Hello", "Bye"));
}
public static int add(double a,double b)
{
	int sum=(int)(a+b);
	return sum;
	//or
//	double sum1=a+b;
//	return (int)sum1;
}

}
