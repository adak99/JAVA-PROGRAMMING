/*

*****
*   *
*   *
*****

 */

public class pattern_2 {
    public static void main(String[] args) {

        int n = 5;
        int m = 5;

        for (int i = 1; i <= n; i++) {// outer loop
            for (int j = 1; j <= m; j++) {// inner loop
                if ((i == 1 || j == 1) || (i == n || j == m)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
