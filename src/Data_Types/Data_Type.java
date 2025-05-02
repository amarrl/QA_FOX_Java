package Data_Types;

public class Data_Type {

	public static void main(String[] args) {

		int a=34;
		short b=(short) a;
		
		int c=(int)99.99;
		
		System.out.println(a);
		System.out.println(c);
		
		char d='c';
		int e=d;
		
		System.out.println(d);
		
		System.out.println(e);
		
		
		//Assigning byte-8 short-16 long-64 float double 64 to int data types
		
		// int a=1226637388392;  The literal 1226637388392 of type int is out of range  as a solution need to add l
		
		int i=(int)1226637388392L;
		
		System.out.println(i);
		
		int j=(int) 4.5f;
		System.out.println(j);
		
		int x=99_99;
		System.out.println(x);
		

	}

}
