package MethodRecursion_Programs;

public class RecurCount {
static int count=1;
static int count1=1;
	public static void main(String[] args) {
		System.out.println(count(123456));	
		System.out.println(count1(10));
	}
	//======count the values present=======//
	public static int count(int n)
	{
		if(n<=9)
		{
			return count;
		}
		else
		{
			count++;
			return count(n/10);
			
		}
	}
	
//=========10 to 1 count how many numbers present=====//	
	public static int count1(int x)
	{
		if(x<=1)
		{
			return count1;
			
		}
		else
		{
			count1++;
			return count1(x-1);
		}
	}
}
