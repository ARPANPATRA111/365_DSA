/*
 * Selection Sort Implementation
 * 
 * Explanation:
 * Selection Sort is an in-place comparison sorting algorithm. It divides the input list into two parts:
 * a sorted sublist of items which is built up from left to right at the front (left) of the list
 * and a sublist of the remaining unsorted items that occupy the rest of the list.
 * The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element
 * in the unsorted sublist, exchanging (swapping) it with the leftmost unsorted element
 * (putting it in sorted order), and moving the sublist boundaries one element to the right.
 * 
 * Time Complexity:
 * - Best Case: O(n^2)
 * - Average Case: O(n^2)
 * - Worst Case: O(n^2)
 * 
 * Space Complexity:
 * - O(1) (auxiliary space, as it is an in-place sort)
 */

package Sort;
import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = { 64, 25, 12, 22, 11 };
        System.out.println("Unsorted Array: " + Arrays.toString(data));

        selectionSort(data);

        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }
}
