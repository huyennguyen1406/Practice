package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Enter want remove element: ");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            while (num == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }

        System.out.print("New Array = " + Arrays.toString(arr));
        sc.close();
    }
}


