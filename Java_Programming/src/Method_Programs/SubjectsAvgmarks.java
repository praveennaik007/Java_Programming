package Method_Programs;

public class SubjectsAvgmarks {
public static void main(String[] args) {
	subjects();
}
public static void subjects()
{
	int a=36;
	int b=56;
	int c=78;
	int d=87;
	int e=70;
	int avg=(a+b+c+d+e)/5;
	System.out.println(avg);
	double perc=(avg*100/500);
	System.out.println(perc);
}
}
