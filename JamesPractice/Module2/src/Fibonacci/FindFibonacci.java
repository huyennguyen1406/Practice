package Fibonacci;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindFibonacci {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // System.out.println("The fibonacci number " + n + ": ")
        // System.out.println(recursiveFibonacci(n));
        //ystem.out.println(loopFibonacci(n));
        FileWriter writer = new FileWriter("output.csv");
        writer.write("n, runtimeRecursive, runtimeLoop\n");
        for (int i = 1; i < 45; i+=1) {
            long start1 = System.nanoTime();
            int fibonacci1 = recursiveFibonacci(i);
            long end1 = System.nanoTime();
            long runTime1 = end1 - start1;

            long start2 = System.nanoTime();
            int fibonacci2 = loopFibonacci(i);
            long end2 = System.nanoTime();
            long runTime2 = end2 - start2;

            String thisOutput = i + "," + runTime1 + "," + runTime2 + "\n";
            writer.write(thisOutput);
        }
        writer.close();

    }

    public static int recursiveFibonacci(int n) {
       if (n == 0){
            return 0;
        }
       if (n == 1) {
           return 1;
       }
       else {
           return recursiveFibonacci(n - 2) + recursiveFibonacci( n - 1);
       }
    }

    public static int loopFibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
           return 1;
        }
       else {
            for (int i = 2; i <= n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
       }
       return fn;
    }
}
