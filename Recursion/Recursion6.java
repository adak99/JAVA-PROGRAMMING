//Print x^n (stack height = n)
public class Recursion6 {
    public static int claculatePower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 1;
        }

        int xpower = claculatePower(x, n - 1);
        int calPower = x * xpower;
        return calPower;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = claculatePower(x, n);
        System.out.println(ans);
    }
}
