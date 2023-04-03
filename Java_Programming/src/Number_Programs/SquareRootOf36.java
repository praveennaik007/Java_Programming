package Number_Programs;

public class SquareRootOf36 {
public static void main(String[] args) {
	int a=36;
	boolean rs=false;
	int g=0;
	for (int i = 1; i <=a; i++) {
		if(i*i==a)
		{
			System.out.println(i);
			g=i;
			rs=true;
		}
	}
	if(rs=true)
	{
		System.out.println("Square root  "+g);
	}
	else
	{
		System.out.println("not a square root ");
	}
}
}
