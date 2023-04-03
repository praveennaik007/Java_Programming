package String_Programs;

public class StringCountSentance {
public static void main(String[] args) {
	String s=" Ravi is a good boy ";
	int count=1;
	for (int i = 0; i < s.length()-1; i++) {
		if(s.charAt(0)==' '&&s.charAt(i)==' '&&s.charAt(i+1)!=' ')
		{
			count++;
		}
		
	}
	System.out.println(count);
}
}
