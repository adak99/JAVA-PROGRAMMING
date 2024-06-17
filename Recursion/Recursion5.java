//print fobonacci serise using recursion
public class Recursion5 {
    public static void calcualteFibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");
        calcualteFibo(b, c, n - 1);
    }

    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        int n = 7;
        calcualteFibo(a, b, n - 2);
    }
}