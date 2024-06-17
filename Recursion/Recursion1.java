//print numbers 5-1 using recursion
public class Recursion1 {

    public static void printNumber(int n) {
        if (n == 0)
            return;

        System.out.print(n + " ");
        printNumber(n - 1);
    }

    public static void main(String args[]) {
        int n = 5;
        printNumber(n);
    }
}
