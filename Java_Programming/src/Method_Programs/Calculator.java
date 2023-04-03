package Method_Programs;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Method"+"1.add"+ "2.sub"+ "3.mul"+"4.div"+"5.mod"+"6.dis");
	int n=sc.nextInt();
	switch (n) {
	case 1:add();
		
		break;
	case 2:sub();
	
	break;
	case 3:mul();
	
	break;
	case 4:div();
	
	break;
	case 5:mod();
	
	break;
	case 6:dis();
	
	break;
	default:
		break;
	}
}
public static void add()
{
	int a=30;
	int b=20;
	int sum=a+b;
	System.out.println(sum);
}
public static void sub()
{
	int a=30;
	int b=20;
	int sub=a-b;
	System.out.println(sub);
}
public static void mul()
{
	int a=30;
	int b=20;
	int mul=a*b;
	System.out.println(mul);
}
public static void div()
{
	int a=10;
	int b=20;
	int div=a/b;
	System.out.println(div);
}
public static void mod()
{
	int a=30;
	int b=20;
	int mod=a%b;
	System.out.println(mod);
}
public static void dis()
{
	int amount=3000;
	int dis=10;
	int total=(amount*dis)/100;
	System.out.println(total);
}


}
