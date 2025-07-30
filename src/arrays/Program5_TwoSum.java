package arrays;

import java.util.Arrays;

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

        int first = 0 , last = nums.length - 1;

        while(first < last){
            if(sortedArray[first] + sortedArray[last] == target){
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

        for(int k = 0 ; k< nums.length; k++){
            if(nums[k] == sumArr[0] && !foundVal1 ){
                outputArrIndex[0] = k;
                foundVal1 = true;
            }
            else if(nums[k] == sumArr[1] && !foundVal2){
                outputArrIndex[1] = k;
                foundVal2 = true;
            }

            if( foundVal1 && foundVal2){
                break;
            }
        }
        return outputArrIndex;
    }


    public static void main(String[] args) {

        int[] arr = {2,5,5,11};
        int target = 10;

        Program5_TwoSum program5TwoSum = new Program5_TwoSum();
        //int resultArr[] = program5TwoSum.twoSum(arr, target);

        int[] resultArr = program5TwoSum.twoSumApproach2(arr, target);

        for (int i : resultArr)
            System.out.println("Output index : " + i);
    }
}
