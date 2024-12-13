public class Armstrong {

    static int power(int digit, int powerValue) {
        int result = 1;
        for (int i = 1; i <= powerValue; i++) {
            result *= digit;
        }
        return result;
    }

    static boolean isArmstrong(int number) {
        int originalNumebr = number, sum = 0;
        int powerValue = 0;

        int temp = number;
        while (temp != 0) {
            temp /= 10;
            powerValue++;
        }

        while (number != 0) {
            int digit = number % 10;
            sum += power(digit, powerValue);
            number /= 10;
        }

        return originalNumebr == sum;
    }

    public static void main(String[] args) {
        int number = 153;

        if (isArmstrong(number)) {
            System.out.println(number + " is an armstrong.");
        } else {
            System.out.println(number + " is not an armstrong.");
        }
    }
}
