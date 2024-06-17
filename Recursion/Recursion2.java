//Print numbers 1-5 using recursion
public class Recursion2 {
    public static void printNumber(int n) {
        if (n == 6) {
            return;
        }

        System.out.print(n + " ");
        printNumber(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNumber(n);
    }
}
