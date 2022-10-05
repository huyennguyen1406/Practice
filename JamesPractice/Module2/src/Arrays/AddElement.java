package Arrays;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element: ");
        int num = sc.nextInt();
        int[] arr1 = new int[num];
        int[] arr2 = new int[num + 1];
        int count = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println("Add number: ");

    }

    public static int[] addElementArray(int x, int index) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        return array;
    }
}
