package Basic_Programs;

public class Mcq5 {
public static void main(String[] args) {
	long l = 30;
    int i = 50;
    short s = 60;
    byte b = 70;
    //int sum = l + i + s + b;//It is in inteeger type here we are 
    						//given long also so it wont take we have to type cast	

    int sum=(int)l+i+s+b;
    System.out.println("Sum = " + sum);
}
}
