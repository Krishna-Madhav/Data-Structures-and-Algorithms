package arrays;

import java.util.ArrayList;

// Given an array arr[], the task is to print every alternate element of the array starting from the first element.
//
//Examples:
//
//Input: arr[] = [10, 20, 30, 40, 50]
//Output: 10 30 50

//Explanation: Print the first element (10), skip the second element (20), print the third element (30), skip the fourth element(40) and print the fifth element(50).
//
//Input: arr[] = [-5, 1, 4, 2, 12]
//Output: -5 4 12
//
public class AlternateNumbersIterative_Program1 {

    private ArrayList<Integer> getAlternates(int[] arr) {

        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                output.add(arr[i]);
            }
        }
        return output;
    }

    public static void main(String[] args) {

        AlternateNumbersIterative_Program1 driver = new AlternateNumbersIterative_Program1();

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> alternateNumbers = driver.getAlternates(arr);

        System.out.println(alternateNumbers);
    }


}
