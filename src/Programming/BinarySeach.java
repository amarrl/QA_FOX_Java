	package Programming;

public class BinarySeach {
    public static void main(String[] args) {
        int[] array = {2,4,5,6,7,1,3}; 
        int target = 2;
        
 
       int result = binarySearch(array, target);  

        if (result == -1) { 
            System.out.println("Element not found."); 
        } else {
            System.out.println("Element found at index: " + result); 
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid	
            if (array[mid] == target) {
                return mid;  
            }
            // If target is greater, ignore left half
            else if (target>array[mid]) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Target is not present in array
        return -1;
    }
}
