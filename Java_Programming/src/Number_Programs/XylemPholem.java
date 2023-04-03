package Number_Programs;

public class XylemPholem {
public static void main(String[] args) {
	int n=12348;
	int x=0,y=0;
	int d=n%10;
	 x=x+d;
	n/=10;
	while(n>9)
	{
		int d1=n%10;
		y=y+d1;
		n/=10;
	}
	x=x+n;
	if(x==y)
	{
		System.out.println("Xylem");
	}
	else
	{
		System.out.println("Pholem");
	}
}
}
