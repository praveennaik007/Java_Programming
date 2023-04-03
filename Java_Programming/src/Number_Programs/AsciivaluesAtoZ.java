package Number_Programs;
import java.util.Scanner;

public class AsciivaluesAtoZ {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("ENTER THE VALUE");
	char ch=sc.next().charAt(0);

	for (char i =ch; i <='z'; i++) {
		int c=i;
		System.out.println(c);
		
	}
	
}
}
