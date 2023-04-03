package Array_Programs;

public class ArrayHowmanyTimesOccurs {
public static void main(String[] args) {
	int a[]= {1,2,1,3,4,1,5,5};
	int b=1;
	int count=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]==b)
		{
			count++;
		}
	}
	System.out.println(count);
}
}
