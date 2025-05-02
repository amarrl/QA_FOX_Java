package WrapperClass;

public class premitiveToObject {

	public static void main(String[] args) {
		//autoboxing the automatic conversion from premitive data type into it's corresponding wrapper clss is 
		
		int i=10;
		Integer j=Integer.valueOf(i);  //converting int to integer explicily 
		
		Integer k=i;   // converting int to integer internally  autoboxing, now compiler will write Integer.valueOf(a) internally  
		
		byte b=10;
		Byte bw=Byte.valueOf(b);
		
		short s=18;
		Short sw=Short.valueOf(s);
		
		char c='e';
		Character cw=Character.valueOf(c);  //converting char to charcter explisity
		Character cww=c;  // autoboxing now complier will internally write Chacter.valueOf(e)

		
		System.out.println(c+" "+cw+" "+cww);
		
		
		//unboxing the process of conversion from wrapper class into correspounding premitive type
		
		Integer o=10;
		int oo=o;
		int kq=o.valueOf(o);  // conver intergr into int explisity
		System.out.println(oo);
		
		Character ff='c';
		char ffw=ff;         // cpnver chacter into char internally it will write char.value of 
		char rr=ff.valueOf(ff);  
		
		
		
		 
		
		
		
		

	}

}
