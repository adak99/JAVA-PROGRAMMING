// Print factorial numbers using recursion
public class Recursion4 {
    public static int calculateFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int factNumber = calculateFactorial(n - 1);
        int factResult = n * factNumber;
        return factResult;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = calculateFactorial(n);
        System.out.println(result);
    }
}
