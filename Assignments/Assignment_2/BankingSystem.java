package Assignment_2;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = 0.0;

        while (true) {
            System.out.println("-----Bank database Menu-----\n1.Diposit.\n2.Withdrwal.\n3.Total Amount.\n4.Exit.");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your Deposit amount:- ");
                    double diposit = scan.nextDouble();
                    if (diposit > 0) {
                        balance += diposit;
                        System.out.println(diposit + "Rs. successfuly diposti in your account.");
                    } else {
                        System.out.println("Invalid enter amount.");
                    }
                    break;
                case 2:
                    System.out.print("Enter your withdrwal amount:- ");
                    double withdrwal = scan.nextDouble();
                    if (withdrwal > 0 && withdrwal <= balance) {
                        balance -= withdrwal;
                        System.out.println(withdrwal + "Rs. Withdrwal sucessfull.");
                    } else if (withdrwal > balance) {
                        System.out.println("Insuficient balance.");
                    } else {
                        System.out.println("Invlid enter amount.");
                    }
                    break;
                case 3:
                    System.out.println("your Total Balance: " + balance);
                    break;
                case 4:
                    System.out.println("Thank your visiting.");
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("please enter chose correct option.");
            }
        }
    }
}
