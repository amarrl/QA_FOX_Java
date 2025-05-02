package Programming;

import java.util.Arrays;

public class Practisb {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 7, 1, 3}; // Input array
        int target = 6; // Target value to find 
        
        
        Arrays.sort(array); 
        System.out.println(Arrays.toString(array));

        int result = binarySearch(array, target); // Call the binarySearch function

        // Print the result of the search
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Iterative binary search implementation
    public static int binarySearch(int[] array, int target) {
        int left = 0; // Start index
        int right = array.length - 1; // End index

        // Continue searching until the left pointer exceeds the right pointer
        while (left <= right) {
            // Calculate mid index
            int mid = left + (right - left) / 2;

            // If the element at mid is equal to the target, return the index
            if (array[mid] == target) {
                return mid;
            }

            // If the target is greater than mid element, search in the right half
            if (target>array[mid]) { 
                left = mid + 1;
            }
            // If the target is smaller than mid element, search in the left half
            else {
                right = mid - 1;
            }
        }

        // If the target element is not found, return -1
        return -1;
    }
}
