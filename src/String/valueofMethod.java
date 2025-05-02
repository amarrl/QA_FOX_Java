package String;

public class valueofMethod {

	public static void main(String[] args) {
		
		//premitive data type to string 
		byte b=14;
		short s=8;
		int i=13;
		char c='f';
		long l=19l;
		float f=23.4f;
		double d=12.45;
		boolean bb=true;
		
		String bs=String.valueOf(b);
		String ss=String.valueOf(s);
		String si=String.valueOf(i);
		String sl=String.valueOf(l);
		String sbb=String.valueOf(bb);
		
		System.out.println(sbb);
		
		//wapprer classes
		
		Byte vb=12;
		Short sb=13;
		Integer ii=12;
		
	
		
		
		String sii=String.valueOf(ii);
		
		//Non -premitive data types
		
		String sss="Amar";
		String oo=sss.valueOf(sss);
		System.out.println(oo);
		
		char[] ccc= {'a','b','c','d','e'};
		
		String scc=String.valueOf(ccc); 
		System.out.println(scc);
		
		
		
		String only=String.valueOf(ccc, 1, 2);  // indext and count from that how many char you want toprint
		System.out.println(only);
		
		
		
		
		

	}

}
