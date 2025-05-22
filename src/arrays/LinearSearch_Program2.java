package arrays;

public class LinearSearch_Program2 {

    private int findElement(int[] arr, int element) {

        int elementIndex = -1; // Assume element is not found at start

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                elementIndex = i;
                break; // So that only first instance is found and in case same elements (number) at later index exists then it's not considered
            }
        }
        return elementIndex;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element = 10;

        LinearSearch_Program2 linearSearch = new LinearSearch_Program2();
        int output = linearSearch.findElement(arr, element);

        System.out.println("Index of the element is: "+output);
    }


}
