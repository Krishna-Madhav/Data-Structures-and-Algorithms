package arrays;

public class Program5_TwoSum {

    // Approach 1 : Brute Force Method
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

    public static void main(String[] args) {

        int arr[] = {2, 7, 11, 15};
        int target = 18;

        Program5_TwoSum program5TwoSum = new Program5_TwoSum();
        int resultArr[] = program5TwoSum.twoSum(arr, target);

        for (int i : resultArr)
            System.out.println(i);
    }
}
