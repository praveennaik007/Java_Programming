package MethodRecursion_Programs;

public class RecirsionPrintWCToTY {
public static void main(String[] args) {
	hi(6);
}
public static void hi(int n)
{
	if(n<=1)
	{
		return;
	}
	else
	{
		System.out.println("Welcome to test yentra");
		hi(n-1);
	}
}
}
