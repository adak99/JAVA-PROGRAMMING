public class GCD {

    public static int calGcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return calGcd(n2, n1 % n2);
    }

    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 13;

        int ans = calGcd(n1, n2);

        System.out.println("GCD of " + n1 + " & " + n2 + " is: " + ans);
    }
}
