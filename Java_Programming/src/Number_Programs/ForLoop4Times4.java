package Number_Programs;

public class ForLoop4Times4 {

	public static void main(String[] args) {
		int a=4;
		for (int j=1  ;j <=4;j++) {
			System.out.print(a);
			
		}
	System.out.println();
	System.out.println();
		System.out.println("Using For Loop Range Even Numbers");
		
		for (int i = 20; i <=40; i++) {
			if(i%2==0)
			{
			System.out.println(i);
			}
		}
		
		System.out.println();
		System.out.println("Using Range odd numbers");
		
		for (int i = 37; i <=50; i++) {
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println("Factorial Of a given number");
		int k=1;
		for (int i = 1; i <=5; i++) {
			k=k*i;
		}
		System.out.println(k);
		
		System.out.println();
		System.out.println("Average range 10 to 20");
		int w=20;
		int count=0;
		int sum=0;
		
		for (int i =10; i <=w; i++) {
	
			
				sum=sum+i;
				count++;	
		}
		int avg=sum/count;
		System.out.println(avg);
	}
}
