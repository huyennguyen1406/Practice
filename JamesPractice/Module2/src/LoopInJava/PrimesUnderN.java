package LoopInJava;

import java.util.Scanner;

public class PrimesUnderN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The prime numbers under " + n + ": ");
        int currentNumber = 2;
        while (currentNumber < n) {
            if (primeNumber(currentNumber)) {
                System.out.println(currentNumber);
            }
            currentNumber++;
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
