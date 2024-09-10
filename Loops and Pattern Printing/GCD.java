public class GCD {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 14;

        System.out.print("GCd of " + n1 + " & " + n2 + " is: ");
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        System.out.print(n1);
    }
}
