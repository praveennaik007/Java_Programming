package Array_Programs;

public class RemoveElementpurticularIndex {
	public static void main(String[] args) {
		int a[]= {7,2,4,9,5,6,10};
		int index=3;
		if(index>=a.length)
		{
			System.out.println("Invalid ");
		}
		else
		{
			int b[]=new int[a.length-1];
			int j=0;
			for (int i = 0; i < a.length; i++) {
				if(i!=index)
				{
					b[j]=a[i];
					
					j++;
				}
			}
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
		}
	}
}
