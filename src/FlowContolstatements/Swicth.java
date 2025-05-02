package FlowContolstatements;

public class Swicth {
	
	public static void main(String[]args) {
		int a=2;
		
		char c='d';
		
		String s="hiran";
		

		
		switch(s) {
		
		case "ravi":
		System.out.println("inside case 0");
		
		case "kiran":
		System.out.println("inside case 1");
		
		case "hiran":
		System.out.println("inside case 2");
		break;
		
		case "amar":
		System.out.println("inside case amar");
		
		case "joker":
		System.out.println("inside case king");
		
	default:
		System.out.println("inside case default");
		}
		System.out.println("otside swicth case");
	}

}
