package Array_Programs;

public class Demo {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=4;
	a[4]=5;
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
	//To Overcome this we are going to use looping statements
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
