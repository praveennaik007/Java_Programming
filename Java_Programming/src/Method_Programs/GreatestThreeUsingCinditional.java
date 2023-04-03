package Method_Programs;

public class GreatestThreeUsingCinditional {
public static void main(String[] args) {
	greatestThree();
}
public static void greatestThree()
{
	int a=34;
	int b=35;
	int c=20;
	String s=a>b&&a>c?"a is greater":b>c?"b is greater":"c is greater";
	System.out.println(s);
}
}
