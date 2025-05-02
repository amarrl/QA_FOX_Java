package ExceptionHandling;

public class MultipleCatchBlocks {
	
	public static void main (String[]args) {
		String a[]= {"Amar","raju"};
		
		
		
		String ab="Amar Raj";
		
		try {
			//System.out.println(ab.charAt(9));
			
			System.out.println(10/0);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException handled");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handled");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}catch(Throwable e) {
			System.out.println("Errorr Got handled");
		}
			 
		
		
				
		}
	}


