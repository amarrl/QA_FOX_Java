package String;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Amar";
		
		String b="Kumar"; 
		
		String c="Kumar";
		
		String G="Amar kumar"; 
		
		System.out.println(a.equals(b));  //false
		
		System.out.println(b.equals(c));  //true
		
		System.out.println("Amar".equals("amar"));  //false
		
		System.out.println("Amar".equalsIgnoreCase("amar"));  //true
		
		System.out.println("Amar"=="Amar");  //true
		System.out.println("=======================");
		System.out.println("======"+b==c+"============");
		
		System.out.println(G.length());//10
		
		System.out.println("Triming======");
		String trim="   Amar Kumar ";
		System.out.println("Will remove spaces before and after text :"+trim.trim());
		
		System.out.println("SubString=====================");
		
		String substring="Amar Kumar rajkumar";
		String aftersubtring=substring.substring(1);
		System.out.println("after subString :"+aftersubtring);
		
		
		String afters=substring.substring(4, 10);
		System.out.println("After sub :"+afters);
		
		
		System.out.println("===============");
		String random="Amar kumarrajkumar kHnas";
		String SubString2=random.substring(10,18);
		
		System.out.println(SubString2);
		
		
		
		
		

	}

}
