package arrays;


import java.util.ArrayList;

/*
    https://www.geeksforgeeks.org/problems/generating-all-subarrays/1

    Given an array, arr[], generate all possible subarrays using recursion and return them as a vector of vectors.
    The subarrays must be returned in the following order:
          1. Subarrays starting from the first element, followed by subarrays starting from the second element, and so on.
          2. For each starting index, subarrays should be in increasing length.

    Examples:

    Input: arr[] = [1, 2, 3]
    Output: [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
    Explanation: Starting with the first element, we generate subarrays [1], [1, 2], and [1, 2, 3]. Then, starting from the second element, we get [2] and [2, 3].  Finally, starting from the third element, we only get [3].
    Input: arr[] = [1, 2]
    Output: [[1], [1, 2], [2]]
    Explanation: Starting with the first element, we generate subarrays [1] and [1, 2]. Then, starting from the second element, we get [2].
    Input: arr[] = [1, 1]
    Output: [[1], [1, 1], [1]]
    Explanation: Starting with the first element, we generate subarrays [1] and [1, 1] (including both elements). Starting from the second element, we only get the subarray [1].
 */
public class Program9_GenerateSubarrays {

    public static void generateSubarrays(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                for (int k = i; k < j ; k++) {
                    System.out.print(" " + arr[k]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        generateSubarrays(arr);

    }

}
