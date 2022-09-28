package Arrays;


public class FindMinArray {
    public static void main(String[] args) {
        int[]arr = {4, 12, 23, 3, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The min value in array is: " + index);
    }

    public static int minValue(int[] array) {
        int minNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minNum > array[i]) {
                minNum = array[i];
            }
        }
        return minNum;
    }
}
