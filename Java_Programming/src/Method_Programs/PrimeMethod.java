package Method_Programs;

public class PrimeMethod {
	
public static void main(String[] args) {	
  boolean rs=isPrime(6);
System.out.println(rs);
	  
}

public static boolean isPrime(int n)
{
	
	for (int i = 2; i <=n/2; i++) {
		if(n%i==0)
		{
		return false;
		
		}	
	}
	if(false)
	{
		return false;
	
	}
	else
	{
		return true;
	}
}
}
