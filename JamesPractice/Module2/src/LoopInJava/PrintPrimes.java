package LoopInJava;

import java.util.Scanner;

public class PrintPrimes {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The first primes number: " + n);
        int count = 0;
        int num = 2;
        while (count < n) {
            if (primeNumber(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
        sc.close();
    }

    public static boolean primeNumber (int n) {
        if (n < 2) {
            return false;
        }
        int check = (int) Math.sqrt(n);
        for (int i = 2; i <= check; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
