public class Recursion22 {

    static int power(int digit, int powerValue) {
        if (powerValue == 0) {
            return 1;
        }
        return digit * power(digit, powerValue - 1);
    }

    static int calculateNumber(int number, int powerValue) {
        if (number == 0) {
            return 0;
        }

        int digit = number % 10;
        return power(digit, powerValue) + calculateNumber(number / 10, powerValue);
    }

    static boolean isArmstrong(int number, int powerValue) {
        return number == calculateNumber(number, powerValue);
    }

    public static void main(String args[]) {
        int number = 153;
        int powerValue = String.valueOf(number).length();

        if (isArmstrong(number, powerValue)) {
            System.out.println(number + " is an armstrong.");
        } else {
            System.out.println(number + " is not an armstrong.");
        }
    }
}
