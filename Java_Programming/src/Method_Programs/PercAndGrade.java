package Method_Programs;

public class PercAndGrade {
public static void main(String[] args) {
	grade();
}
public static void grade()
{
	int a=36;
	int b=97;
	int c=78;
	int d=87;
	int e=70;
	int sum=a+b+c+d+e;
	double perc=(sum*100/500);
	System.out.println(perc);
	if(perc>90)
	{
		System.out.println("A grade ");
	}
	else if(perc>80&&perc<=90)
	{
		System.out.println("B grade");
	}
	else if(perc>=60&&perc<=80)
	{
		System.out.println("C grade");
	}
	else
	{
		System.out.println("D grade ");
	}
}
}
