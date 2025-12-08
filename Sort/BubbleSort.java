/*
 * Bubble Sort Implementation
 * 
 * Explanation:
 * Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
 * compares adjacent elements and swaps them if they are in the wrong order.
 * The pass through the list is repeated until the list is sorted.
 * 
 * Time Complexity:
 * - Best Case: O(n) (when the array is already sorted)
 * - Average Case: O(n^2)
 * - Worst Case: O(n^2) (when the array is reverse sorted)
 * 
 * Space Complexity:
 * - O(1) (auxiliary space, as it is an in-place sort)
*/

package Sort;
import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] data = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Unsorted Array: " + Arrays.toString(data));

        bubbleSort(data);

        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }
}
