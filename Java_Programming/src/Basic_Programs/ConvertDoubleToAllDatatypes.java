package Basic_Programs;

public class ConvertDoubleToAllDatatypes {
public static void main(String[] args) {
	double d1=35.56;
	float f=(float)d1;
	System.out.println("double to float "+d1);
	
	float f1=20.56f;
	long l=(long)f1;
	System.out.println("double to long "+d1);
	
	long l1=20l;
	int i=(int)l1;
	System.out.println("double to int "+d1);
	
	int i1=25;
	short s=(short)i1;
	System.out.println("double to short "+d1);
	
	short s1=56;
	byte b=(byte)s1;
	System.out.println("double to float "+d1);
}
}
