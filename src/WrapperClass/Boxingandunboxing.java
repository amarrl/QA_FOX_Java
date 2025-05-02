package WrapperClass;

public class Boxingandunboxing {

	public static void main(String[] args) {
		System.out.println("Auto Boxing  Converting Premitive into Objects");
		
		byte b=10;
		short s=11; 
		char c='p';
		int i=12;
		long l=10L;
		float f=19.23f;
		double d=13.99;
		boolean bu=true;
		
		
		
		Byte bw=b;
		Short sw=s;
		Character cw=c;
		Integer iw=i;
		Long lw=l;
		Float fw=f;
		Double dw=d;
		Boolean bww=bu;
		
		
		
		
		
		System.out.println("printing object values");
		
		System.out.println(bw);
		System.out.println(sw);
		System.out.println(cw);
		System.out.println(iw);
		System.out.println(lw);
		System.out.println(fw);
		System.out.println(dw);
		System.out.println(bww);
		
		System.out.println("Unboxing converting objects into premitive");
		
		byte bun=bw;
		short sun=sw;
		char cun=cw;
		int iun=iw;
		
		System.out.println(bun);
		System.out.println(sun);
		System.out.println(cun);
		System.out.println(iun);
		
		

	}

}
