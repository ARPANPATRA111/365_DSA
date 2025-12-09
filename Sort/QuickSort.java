/*
 * Quick Sort Implementation
 * 
 * Explanation:
 * Quick Sort is a divide-and-conquer algorithm. It works by selecting a 'pivot' element from
 * the array and partitioning the other elements into two sub-arrays, according to whether
 * they are less than or greater than the pivot. The sub-arrays are then sorted recursively.
 * 
 * Time Complexity:
 * - Best Case: O(n log n)
 * - Average Case: O(n log n)
 * - Worst Case: O(n^2) (when the pivot is always the smallest or largest element)
 * 
 * Space Complexity:
 * - O(log n) (due to recursive stack space)
 */

package Sort;  
import java.util.Arrays;

public class QuickSort {

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /* The main function that implements QuickSort
       arr[] --> Array to be sorted,
       low --> Starting index,
       high --> Ending index */
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] data = { 10, 7, 8, 9, 1, 5 };
        System.out.println("Unsorted Array: " + Arrays.toString(data));

        quickSort(data, 0, data.length - 1);

        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }
}
