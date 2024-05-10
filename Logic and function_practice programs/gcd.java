import java.util.Scanner;

public class gcd {

    public static int claculateGcd(int num1, int num2) {

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number:");
        int num2 = scan.nextInt();

        System.out.println("Answer: " + claculateGcd(num1, num2));
    }
}
