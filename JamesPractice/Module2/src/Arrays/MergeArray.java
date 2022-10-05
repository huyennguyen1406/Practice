package Arrays;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8};
        int length = arr1.length + arr2.length;
        int[] merge = new int[length];
        int num = 0;
        for (int element : arr1) {
            merge[num] = element;
            num++;
        }
        for (int element : arr2) {
            merge[num] = element;
            num++;
        }
        System.out.println(Arrays.toString(merge));
    }
}
