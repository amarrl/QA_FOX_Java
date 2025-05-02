package Data_Types;

public class Operators {

	public static void main(String[] args) {
		String s=(10+20+"test"+10);
		
		System.out.println(s);
		
		int r=10;
		int j=2;
		
		System.out.println(r/j);  //5
		System.out.println(r%j);  //0
		
		
		//increment Operator
		int a=5;
		++a;
		System.out.println(a);//6
		
		a++;
		System.out.println(a); //7
		
		//diffrence between pre in crement and post increment
		int b=10;
		System.out.println(b);
		System.out.println(++b); //11
		
		System.out.println(b++); //11
		
		System.out.println(b); //12
		
		System.out.println("===============");
		
		int c=10;
		System.out.println("value of c is "+c++);//10
		
		
		
		

	}

}
