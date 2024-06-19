//Print x^n (stack hight = log n)
public class Recursion7 {
    public static int calculatePower(int x, int n) {
        // base case
        if (n == 0) { // base case 1
            return 1;
        }
        if (x == 0) { // base case 2
            return 1;
        }

        // if n value is even
        if (n % 2 == 0) {
            return calculatePower(x, n / 2) * calculatePower(x, n / 2);
        }
        // if n value is odd
        else {
            return calculatePower(x, n / 2) * calculatePower(x, n / 2) * x;
        }
    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        int result = calculatePower(x, n);
        System.out.println(result);
    }
}
