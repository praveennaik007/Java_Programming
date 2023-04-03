package Number_Programs;
import java.util.Scanner;

public class ProductofN {
public static void main(String[] args) {
	
int n=5;	
int prod=1;
while(n>0)
{
	prod=prod*n;
	n--;
}
System.out.println("Product is: "+prod);
}
}
