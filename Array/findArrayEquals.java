public class findArrayEquals {
    private static void calculateValue(int a[], int b[], boolean arrayEquals) {

        if (a.length != b.length) {
            arrayEquals = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    arrayEquals = false;
                }
            }
        }

        if (arrayEquals) {
            System.out.println("Both the array vale is equla. ");

            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
        } else {
            System.out.println("Both the array elements are not equal.");

            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
        }

    }

    public static void main(String args[]) {

        int a[] = { 1, 2, 3, 4 };
        int b[] = { 1, 2, 3, 4 };
        boolean arrayEquals = true;

        calculateValue(a, b, arrayEquals);
    }
}
