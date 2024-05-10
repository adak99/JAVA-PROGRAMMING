/* 

*
**
***
****

*/

public class pattern_3 {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) { // outer loop
            for (int j = 1; j <= i; j++) {// iner loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
