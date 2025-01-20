import java.util.Scanner;

public class Question_4 {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scan.nextInt();
        scan.close();

        if (isLeapYear(year)) {
            System.out.println(year + " is leap year.");
        } else {
            System.out.println(year + " is not leap year.");
        }

    }
}
