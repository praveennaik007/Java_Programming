package Basic_Programs;
import java.util.Scanner;

public class SwitchShopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Size : ");
		
		int size=sc.nextInt();
		switch (size) {
		case 1:System.out.println("size is ok");
		
			break;
		case 28: System.out.println("go to small size ");
		break;
		
		}
	}
}
