package arrays;

import java.util.Arrays;

/**
 * Second Largest
 * Difficulty: EasyAccuracy: 26.72%Submissions: 1.2MPoints: 2Average Time: 15m
 * Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
 *
 * Note: The second largest element should not be equal to the largest element.
 *
 * Examples:
 *
 * Input: arr[] = [12, 35, 1, 10, 34, 1]
 * Output: 34
 * Explanation: The largest element of the array is 35 and the second largest element is 34.
 * Input: arr[] = [10, 5, 10]
 * Output: 5
 * Explanation: The largest element of the array is 10 and the second largest element is 5.
 * Input: arr[] = [10, 10, 10]
 * Output: -1
 * Explanation: The largest element of the array is 10 and the second largest element does not exist.
 */
public class SecondLargestNumber_Program4 {

    public static void main(String[] args) {
        int[] arr = {1000, 5, 1000};

        SecondLargestNumber_Program4 pr = new SecondLargestNumber_Program4();
        int output = pr.secondLargest(arr);
        System.out.println("Second largest element in arr " + Arrays.toString(arr) + " is : \n" + output);
    }

    private int secondLargest(int[] arr) {

        int largest = (arr[0] > arr[1]) ? arr[0] : arr[1];
        int secondLargest = (arr[0] > arr[1] ? arr[1] : arr[0]);

        //  int largest = Math.max(arr[0], arr[1]);
        // int secondLargest = (Math.min(arr[0], arr[1]));

        System.out.println("largest " + largest + " secondlargest " + secondLargest);

        for (int i = 2; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            }
            if (secondLargest < arr[i] && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("largest " + largest + " secondlargest " + secondLargest);
        if (largest == secondLargest) return -1;
        return secondLargest;
    }
}
