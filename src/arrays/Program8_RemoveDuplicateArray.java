package arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Remove duplicates from Sorted Array

 * Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order.
 * <p>
 * Note: The elements after the distinct ones can be in any order and hold any value, as they don't affect the result.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [2, 2, 2, 2, 2]
 * Output: [2]
 * Explanation: All the elements are 2, So only keep one instance of 2.
 * <p>
 * Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
 * Output: [1, 2, 3, 4, 5]
 * <p>
 * Input: arr[] = [1, 2, 3]
 * Output: [1, 2, 3]
 * Explanation : No change as all elements are distinct.
 */
public class Program8_RemoveDuplicateArray {

    /*
                                         Approach 1
                                        Using arrays
     */

    public static int[] removeDuplicateFromArray(int[] arr) {

        if(arr == null || arr.length == 0){
            return new int[0];
        }
        
        int length = arr.length;

        int[] outputArr = new int[length];
        int outputArrIndex = 1;

        outputArr[0] = arr[0];

        for (int i = 1; i < length; i++) {

            if (arr[i] != arr[i - 1]) {
                outputArr[outputArrIndex++] = arr[i];
            }
        }

        return Arrays.copyOf(outputArr, outputArrIndex);
    }

    /*
                                            Approach 2
                                          Using hashset
     */
    public static int[] removeDuplicateFromArray2(int[] arr) {

        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        Set<Integer> treeSet = new TreeSet<>();

        for (int x : arr)
            treeSet.add(x);

        return  treeSet.stream().mapToInt(value -> value).toArray();
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 9, 10, 10};

        int[] removeDuplicate = removeDuplicateFromArray2(array);

        for (int x : removeDuplicate)
            System.out.print(" " + x);
    }
}
