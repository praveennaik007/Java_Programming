package Basic_Programs;
import java.util.Scanner;

public class SwitchSujects {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the chioce 1.English 2.Maths 3.Physics 4.Sanskrit ");
		int subject=sc.nextInt();
		switch (subject) {
		
		case 1:System.out.println("kannada");
		break;
		case 2:System.out.println("Maths");
		break;
		case 3:System.out.println("Physics");
		break;
		case 4:System.out.println("Sanskrit is your 1 st language");
		break;
		
		}
				
	}
}
