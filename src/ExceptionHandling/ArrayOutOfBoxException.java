package ExceptionHandling;

public class ArrayOutOfBoxException {

	public static void main(String[] args) {
		int arr[]= {1,3,4,5,6,7};
		
		try {
		System.out.println(arr[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of box sexception handled");
			
		}
		System.out.println("===========");
		
	//	catch(Throwable e) {
	//		System.out.println("Array Index out of box sexception handled");
			
	//	}

	}

}
