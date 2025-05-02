package FlowContolstatements;

public class Selectionsrtemenets {
	
	public static void main(String[]args) {
		int a=5; int b=6,  c=8;
		System.out.println("before if block");
		
		if(a<b) {
			if(b<a) {
				System.out.println("b is greater than a");
			}
			
			else {
				if(a==c) {
				System.out.println("a is equal to c");
				}
				
				else {
					System.out.println("a is not qeual to c");
				}
			}
		}
		
		else {
			System.out.println("b is not less than a");
		}
	
System.out.println("========================");

System.out.println(a<b?"a is less than b":"a is greter than b");
	
		
	}

}
