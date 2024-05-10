import java.util.Scanner;

public class findFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, factorial = 1;

        System.out.print("Enter any Number: ");
        n = scan.nextInt();

        if (n < 0) {
            System.out.println("Invalid");
            return;
        }

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Answer: " + factorial);
    }
}
