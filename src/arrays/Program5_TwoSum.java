package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
      https://leetcode.com/problems/two-sum
 */
public class Program5_TwoSum {


    /*  Approach 1 : Brute Force Method
        In brute force approach, I try to find all the possible combination of the sum.
        Here, I have used two pointers to maintain a track of the target value.

        TC - O(n^2)
     */

    public int[] twoSum(int[] nums, int target) {

        int[] outputArr = new int[2];
        int outputArrIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    outputArr[outputArrIndex++] = i;
                    outputArr[outputArrIndex] = j;
                }
            }
        }
        return outputArr;
    }

    // Approach 2 : Using sorting method
    /*
        In this approach, the given array is sorted at first.
        Then, I make use of two pointers one from the start and the other from the end.
        Using these pointers I find the sum of the values and compare it against the target value
        which gives the required values whose sum is equivalent to the target.
        At last iterate through the array and find the indices of those value and return them.

        Sorting takes --> n log n
        Finding the elements --> O(n)
        Finding it's indices takes --> O(n)

        So overall TC - O(n log n)
     */

    public int[] twoSumApproach2(int[] nums, int target) {

        int[] sumArr = new int[2];

        int[] sortedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArray);

        int first = 0, last = nums.length - 1;

        while (first < last) {
            if (sortedArray[first] + sortedArray[last] == target) {
                sumArr[0] = sortedArray[first];
                sumArr[1] = sortedArray[last];
                break;
            }

            if (sortedArray[first] + sortedArray[last] < target) {
                first++;
            }
            if (sortedArray[first] + sortedArray[last] > target) {
                last--;
            }
        }

        int[] outputArrIndex = new int[2];
        boolean foundVal1 = false;
        boolean foundVal2 = false;

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == sumArr[0] && !foundVal1) {
                outputArrIndex[0] = k;
                foundVal1 = true;
            } else if (nums[k] == sumArr[1] && !foundVal2) {
                outputArrIndex[1] = k;
                foundVal2 = true;
            }

            if (foundVal1 && foundVal2) {
                break;
            }
        }
        return outputArrIndex;
    }

    /**
     * In this approach I'm using hashmap to find the indices of the numbers whose sum is equal to the target

     * I store each number in a hashmap where number from the given array is the 'key' and 'value' is the respective index.
     * We make use of concept of a+b = target. Then for a given number remainder is c - a. Using this I compute if the remainder is
     * present in the 'key' of hashmap which also gives the required index of the number.

     * This in turn is returned back to the calling function
     *
     * @param arr Given array
     * @param target Value is the sum of two numbers
     * @return
     */
    public int[] twoSumApproach3(int[] arr, int target) {

        Map<Integer, Integer> mapValueAndIndex = new HashMap<>();
        int[] outputArrIndex = new int[2];

        for (int i = 0; i < arr.length; i++) {

            int remainingValue = target - arr[i];

            if (mapValueAndIndex.containsKey(remainingValue)) {
                outputArrIndex[0] = mapValueAndIndex.get(remainingValue);
                outputArrIndex[1] = i;
            }
            mapValueAndIndex.put(arr[i], i);
        }

        return outputArrIndex;
    }


    public static void main(String[] args) {

        int[] arr = {1, 5, 5, 11};
        int target = 10;

        Program5_TwoSum program5TwoSum = new Program5_TwoSum();
        // int resultArr[] = program5TwoSum.twoSum(arr, target);

        // int[] resultArr = program5TwoSum.twoSumApproach2(arr, target);

        int[] resultArr = program5TwoSum.twoSumApproach3(arr, target);
        System.out.print("Output index : ");

        for (int i : resultArr)
            System.out.print(i + " ");
    }
}
