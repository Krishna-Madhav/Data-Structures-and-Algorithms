package arrays;

/**
 * https://www.geeksforgeeks.org/dsa/program-check-array-sorted-not-iterative-recursive/
 * <p>
 * Input: arr[] = [10, 20, 30, 40, 50]
 * Output: true
 * Explanation: The given array is sorted.
 * <p>
 * Input: arr[] = [90, 80, 100, 70, 40, 30]
 * Output: false
 * Explanation: The given array is not sorted.
 */
public class Program7_CheckSortedArray {

    public static void checkIfArrayIsSorted(int[] arr) {

        int length = arr.length;
        int largest = arr[0]; // Assuming first element to be largest

        boolean isSorted = false;

        for (int i = 1; i < length; i++) {

            if (arr[i] >= largest) {
                largest = arr[i];
            } else {
                isSorted = false;
                break;
            }
            if (i == length - 1) {
                isSorted = true;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is unsorted");
        }


    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 6, 7, 8, 10, 8, 11, 123};

        checkIfArrayIsSorted(arr);
    }
}
