// Place Tiles of size 1xm in a floor of size nxm
public class Recursion19 {

    public static int placeTiles(int n, int m) {
        // base case
        if (n == m) {
            return 2;
        } else if (n < m) {
            return 1;
        }

        // vertically
        int verticalPlacement = placeTiles(n - m, m);

        // horizontally
        int horizontalPlacement = placeTiles(n - 1, m);

        return verticalPlacement + horizontalPlacement;
    }

    public static void main(String[] args) {
        int n = 2, m = 3;
        System.out.println(placeTiles(n, m));
    }
}
