package ExceptionHandling;

public class StatementExcutionInTryBlock {

	public static void main(String[] args) {
		try {
			System.out.println("Before Exception in try Block");
			int a=10/2;
			System.out.println("After Exception in try block");   //skipped will not get executed as exception has ocuured
		}catch(Exception e){
			System.out.println("Insider catch Blocks");
		}

	}

}
