import java.util.Scanner;

public class findFactorialUsingFunction {

    private static void printFactorila(int n) {

        if (n < 0) {
            System.out.println("Invalid.");
            return;
        }
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("Answer: " + factorial);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        printFactorila(n);
    }
}
