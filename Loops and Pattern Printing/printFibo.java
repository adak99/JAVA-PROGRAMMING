public class printFibo {
    public static void main(String[] args) {
        int n = 7;
        int a = 0, b = 1, c;

        System.out.print(a + " " + b + " ");

        for (int i = 1; i <= n - 2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
