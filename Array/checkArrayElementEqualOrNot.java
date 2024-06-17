public class checkArrayElementEqualOrNot {

    private static void check2DArrayValue(int a[][], int b[][]) {

        boolean equal = true;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i][j] != b[i][j]) {
                    equal = false;
                }
            }
        }

        if (equal) {
            System.out.println("Both the element of the array is: Equal");
        } else {
            System.out.println("Both the element of the array is: Not equal");
        }
    }

    public static void main(String args[]) {

        int a[][] = { { 1, 2, 3 },
                { 4, 5, 6 }, { 7, 8, 9 } };
        int b[][] = { { 1, 2, 3 },
                { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.print("Elements of a[]: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();
        System.out.print("Elements of b[]: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println();
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
        System.out.println();
        check2DArrayValue(a, b);

    }
}
