package String_Programs;

public class Non {

	public static void main(String[] args) {

		int num[]= {123,34,23,90,56,16,0};
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==0)
			{
				System.out.println(num[i]+" ");
			}
		}
		for (int i = num.length-1; i>=0; i--) {
			if(num[i]%2==1)
			{
				System.out.println(num[i]+" ");
			}
		}
		
		
		
		
}
}
