package arrays;

import java.util.ArrayList;

public class AlternateNumbers_Program1 {

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

        AlternateNumbers_Program1 driver = new AlternateNumbers_Program1();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> alternateNumbers = driver.getAlternates(arr);

        System.out.println(alternateNumbers);
    }


}
