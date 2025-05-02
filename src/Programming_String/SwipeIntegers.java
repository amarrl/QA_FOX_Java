package Programming_String;

public class SwipeIntegers {

	public static void main(String[] args) {
int num1 = 15, num2 = 35;
        
        System.out.println("Numbers before swapping: num1 = " + num1 + ", num2 = " + num2);
        
        // Swapping without a temporary variable
        num1 = num1 + num2; // num1 now becomes 30 
        num2 = num1 - num2; // num2 becomes 10 (original value of num1)
        num1 = num1 - num2; // num1 becomes 20 (original value of num2)
        
        System.out.println("Numbers after swapping: num1 = " + num1 + ", num2 = " + num2);

	}

}
