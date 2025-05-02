package ExceptionHandling;

public class FinallyException {

	public static void main(String[] args) {
		String s[]= {"Amar","kumar","Raj"};
		try {
		System.out.println(s[2]);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("No matter catch block will execute or not finnaly block will alway get executed");
		}
		
		
		}

	}


