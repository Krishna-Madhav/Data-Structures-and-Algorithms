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

    public static boolean checkIfArrayIsSorted(int[] arr) {

        int length = arr.length;

        if (arr == null || length <= 1) {
            return true;
        }

        for (int i = 1; i < length; i++) {

            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        // If false is not returned inside loop that means all the elements are sorted in ascending order
        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 7, 8, 10, 11, 123};

        if (checkIfArrayIsSorted(arr)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is unsorted");
        }
    }
}
