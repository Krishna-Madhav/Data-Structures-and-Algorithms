package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/dsa/leaders-in-an-array/
 * <p>
 * Given an array arr[] of size n, the task is to find all the Leaders in the array. An element is a Leader if it is greater than or equal to all the elements
 * to its right side.
 * <p>
 * Note: The rightmost element is always a leader.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [16, 17, 4, 3, 5, 2]
 * Output: [17 5 2]
 * Explanation: 17 is greater than all the elements to its right i.e., [4, 3, 5, 2], therefore 17 is a leader. 5 is greater than all the elements to its right i.e., [2], therefore 5 is a leader. 2 has no element to its right, therefore 2 is a leader.
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5, 2]
 * Output: [5 2]
 * Explanation: 5 is greater than all the elements to its right i.e., [2], therefore 5 is a leader. 2 has no element to its right, therefore 2 is a leader.
 */

public class Program6_LeadersArray {

    /*
           This is approach 1 using Brute force. Here, I try to iterate from left to right.

           TC - O(n^2)

           I think I can reduce the number of comparisons if I compare from right to left

     */
    public static void printLeaders(int[] arr) {

        List<Integer> outputList = new ArrayList<>();

        boolean isLeader;
        int arrayLength = arr.length;

        for (int i = 0; i < arrayLength; i++) {

            isLeader = false;

            if (i == arrayLength - 1) {
                outputList.add(arr[i]);
                break;
            }

            for (int j = i + 1; j < arrayLength; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
                isLeader = true;
            }

            if (isLeader)
                outputList.add(arr[i]);
        }

        System.out.println("Approach 1");
        for (int leader : outputList)
            System.out.print(leader + " ");
    }

    /**
     * In this apporach I'm starting from the last and making use of maxNum variable which stores the list of last leaders. In order to find the next leader
     * we need to have a number bigger than the last leader.
     *
     * TC - O(n)
     * @param arr
     */
    public static void printLeaders2(int[] arr) {

        int length = arr.length;
        int maxNum = arr[length - 1];

        ArrayList<Integer> outputList = new ArrayList<>();
        outputList.add(maxNum);

        for (int i = length - 2; i >= 0; i--) {

            if (arr[i] > maxNum) {
                maxNum = arr[i];
                outputList.add(maxNum);
            }
        }

        System.out.println("\nApproach 2");

        for (int a : outputList)
            System.out.print(a + " ");
    }

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        printLeaders(arr);
        printLeaders2(arr);
    }
}
