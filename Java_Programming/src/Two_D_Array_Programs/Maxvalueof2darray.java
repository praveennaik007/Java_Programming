package Two_D_Array_Programs;

public class Maxvalueof2darray {
public static void main(String[] args) {
	int a[][]= {{2,3,4},{2,6,7},{5,6,9}};
	int c[][]=new int[a.length][a[0].length];
	int max=a[0][0];
	int min=a[0][0];
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[i].length; j++) {
		if	(a[i][j]>max)
		{
			max=a[i][j];
		}
		if(a[i][j]<min)
		{
			min=a[i][j];
		}
		}
		System.out.print(max+" ");
		//SSystem.out.print(min+" ");
	}
	System.out.println();
}
}
