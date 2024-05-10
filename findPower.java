import java.util.Scanner;

public class findPower {

    private static double power(double x, double n) {

        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / power(x, -n);
        } else {
            double result = 1;
            for (int i = 0; i < n; i++)
                result *= x;
            return result;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base number (x): ");
        double x = scan.nextDouble();

        System.out.print("Enter the exponent (n): ");
        double n = scan.nextDouble();

        double result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}
