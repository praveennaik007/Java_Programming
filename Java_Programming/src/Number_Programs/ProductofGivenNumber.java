package Number_Programs;

public class ProductofGivenNumber {
public static void main(String[] args) {
	int a=143;
	int prod=1;
	while(a!=0)
	{
		int d=a%10;
		prod=prod*d;
		a/=10;
	}
	System.out.println("The product is "+prod);
}
}
