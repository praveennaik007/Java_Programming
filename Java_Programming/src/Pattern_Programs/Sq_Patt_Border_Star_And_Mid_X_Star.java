package Pattern_Programs;

public class Sq_Patt_Border_Star_And_Mid_X_Star {
public static void main(String[] args) {
	int n=5;
	for (int i = 1; i <=n; i++) {
	for (int j = 1; j <=n; j++) {
		if(i==1||j==1||i==n||j==n||i==j||i+j==n+1)
		{
		System.out.print("* ");
		}
		else
		{
			System.out.print("  ");
		}
	}
	System.out.println();
	}
}
}
