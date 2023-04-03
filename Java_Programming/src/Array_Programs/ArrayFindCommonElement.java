package Array_Programs;

import java.util.Scanner;

public class ArrayFindCommonElement {
public static void main(String[] args) {
	int[] a= {1,2,4,5,6};
	int[] a1= {2,4,4,4};
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=a1.length-1;j++)
		{
			if(a[i]==a1[j])
			{
				System.out.println(a[i]);
			}
	
		}
	}
}
}
