package Pattern_Programs;

public class Sq_PattStarAlpabet_MidEmpty {
public static void main(String[] args) {
	int n=5;
	int ch=65;
	for (int i = 1; i <=n; i++) {
	for (int j = 1; j <=n; j++) {
		if(i==1||j==1||i==n||j==n)
		{
		System.out.print((char)(ch)+" ");
		ch++;
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
