package Data_Types;

public class IncrementandDecrementOperator {

	public static void main(String[] args) {
		
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
		System.out.println(c); //11
		
		System.out.println("=========logical programme");
		
		//logical programme
		
		int d=2;
		int e=3;
		
		int f=d++;
		int g=e++;
		
		
				System.out.println(d); //3
				System.out.println(e); //4
				System.out.println(f); //2
				System.out.println(g); //3
				
				char h='a';
				
				System.out.println(++h); //b

	}

}
