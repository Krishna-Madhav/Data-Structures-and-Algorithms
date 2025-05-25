package arrays;

import java.util.Arrays;

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
