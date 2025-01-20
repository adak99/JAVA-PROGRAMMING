package Assignment_2;

import java.util.Scanner;

public class FibonacciSerise {
    public static void fibonacciSrise(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(" " + c);
        fibonacciSrise(b, c, n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an number: ");
        int n = scan.nextInt();
        scan.close();

        int a = 0, b = 1;

        System.out.printf("Fibonacci serise to %d: %d %d", n, a, b);

        fibonacciSrise(a, b, n - 2);
    }
}
