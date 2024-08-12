package com.neml.gfgjava;

public class NthFibonacciNum {

    public static void main(String[] args) {
        int n = 14;
        long result = GetNthNumber.nthFibonacci(n);
        System.out.println(result);
    }

}

class GetNthNumber {
    public static long nthFibonacci(int n) {
        if (n <= 1)
            return n;

        long a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
        System.out.println();

        return b;
    }
}
