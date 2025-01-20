package Assignment_2;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an number: ");
        int n = scan.nextInt();
        scan.close();

        System.out.printf("Factorial of %d is : %d\n", n, factorial(n));
    }
}
