package Assignment_2; // no need to write

import java.util.Scanner;

public class IncomeTaxCalculator {

    public static double tax(double earning) {
        if (earning <= 50000) {
            return 0.0;
        } else if (earning <= 60000) {
            return (earning - 50000) * 0.10;
        } else if (earning <= 150000) {
            return (60000 - 50000) * 0.10 + (earning - 60000) * 0.20;
        } else {
            return (60000 - 50000) * 0.10 + (150000 - 60000) * 0.20 + (earning - 150000) * 0.30;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter earning of the employee: ");
        double earning = scan.nextDouble();
        scan.close();

        System.out.print("Income tax to be paid is: Rs. " + tax(earning));
    }
}
