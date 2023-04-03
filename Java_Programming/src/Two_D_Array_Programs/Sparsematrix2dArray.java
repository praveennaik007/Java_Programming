package Two_D_Array_Programs;

public class Sparsematrix2dArray {

public static void main(String[] args) {
	int a[][]= {{1,0,0},{0,1,0},{0,0,1}};
	int count=0;
	int num=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			if(a[i][j]==0)
			{
				count++;
			}
			else
			{
				num++;
			}
		}	
	}
	if(num<count)
	{
		System.out.println("Sparse ");
	}
	else
	{
		System.out.println("not Sparse ");
	}
}
}
