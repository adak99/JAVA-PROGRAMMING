
/* 

****
***
**
*

*/
import java.util.Scanner;

public class pattern_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a No:- ");
        int n = scan.nextInt();

        scan.close();

        for (int i = 1; i <= n; i++) {// outer loop
            for (int j = n; j >= i; j--) {// iner loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
