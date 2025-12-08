/*
 * Insertion Sort Implementation
 * 
 * Explanation:
 * Insertion Sort is a simple sorting algorithm that builds the final sorted array (or list)
 * one item at a time. It is much less efficient on large lists than more advanced algorithms
 * such as quicksort, heapsort, or merge sort.
 * It works similarly to the way you sort playing cards in your hands.
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

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are greater than key,
               to one position ahead of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] data = { 12, 11, 13, 5, 6 };
        System.out.println("Unsorted Array: " + Arrays.toString(data));

        insertionSort(data);

        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }
}
