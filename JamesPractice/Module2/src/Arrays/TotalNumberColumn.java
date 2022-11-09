package Arrays;

import java.util.Scanner;

public class TotalNumberColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length array: ");
        int length = sc.nextInt();
        System.out.println("Enter width array: ");
        int width = sc.nextInt();
        int[][] arr = new int [length][width];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("Element position [" + i + "][" + j + "] is: ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter column: ");
        int col = sc.nextInt();
        int total = 0;
        for (int i = 0; i < length; i++) {
            total += arr[i][col - 1];
        }
        System.out.println("Colum total is: " + total);
        }
    }
