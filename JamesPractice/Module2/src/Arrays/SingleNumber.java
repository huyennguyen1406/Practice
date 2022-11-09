package Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 3, 5, 6, 5, 7, 8, 7, 8, 2, 4, 1, 9, 6};
        System.out.println("Single element in array is: " + singleElement(arr, arr.length));
    }
    public static int singleElement(int[] arr, int num) {
        for (int i = 0; i < num; i++) {
            int count = 0;
            for (int j = 0; j < num; j++) {
                if (arr[i] == arr[j] && i != j)
                    count++;
            }
            if (count == 0) {
                return arr[i];
            }
        }
        return -1;
    }
}
