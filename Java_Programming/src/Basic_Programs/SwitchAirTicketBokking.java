package Basic_Programs;
import java.util.Scanner;

public class SwitchAirTicketBokking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Choice "+"1.business class"+"2.Economical Class"+"3.Luxery class");
		int Bokking=sc.nextInt();
		switch (Bokking) {
		case 1:System.out.println("business class");
			
			break;
		case 2:System.out.println("economical class");
		
		break;
		case 3:System.out.println("luxury class");
		
		break;

		default:
			break;
		}
	}
}
