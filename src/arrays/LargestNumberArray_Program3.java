package arrays;

import java.util.Arrays;

public class LargestNumberArray_Program3 {

    // Approach 1 (Manually iterating through the array)
    private int largestNumber(int[] arr) {

        int largestNum = arr[0]; //Assuming 0th index has the highest number

        for (int i = 1; i < arr.length; i++) {
            if(largestNum < arr[i]){
                largestNum = arr[i];  // Putting largest number so far in thi variable
            }
        }

        return largestNum;
    }

    // Approach 2 (Using in-built method to reduce lines of code)
    
    
    public static void main(String[] args) {

        int arr[] = {1,2,4,56,700,8, 100};

        LargestNumberArray_Program3 driver = new LargestNumberArray_Program3();
    
    
        int output  = driver.largestNumber(arr);
        System.out.println("Largest number in the arr " + Arrays.toString(arr) + " is \n" + output);

        int output1 = driver.largestNumber2(arr);
        System.out.println("Largest number using approach2 : \n"+ output1);

    }

    private int largestNumber2(int[] arr) {

        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        return largest;
    }


}
