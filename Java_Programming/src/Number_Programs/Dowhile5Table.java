package Number_Programs;

public class Dowhile5Table {
public static void main(String[] args) {
	int i=1;
	int j=5;
	do {
		System.out.println(j+"*"+i+"="+(i*j));
		
		i++;
		
	}
	while(i<=10);
	
	System.out.println();
	System.out.println("Using for loop table 15");
	
	int b=5;
	for (int k = 1; k<=10; k++) {
		
		System.out.println(b+"*"+k+"="+(k*b));	
	}
}
}
