package String_Programs;

public class ReplaceElement {
public static void main(String[] args) {
	String x="Hero";
	char c[]=x.toCharArray();
	x=x.toLowerCase();
	char ca='L';
	for (int i = 0; i < c.length; i++) {
		if(c[i]=='r')
		{
			c[i]=ca;
		}
	}
	System.out.println(c);
}
}
