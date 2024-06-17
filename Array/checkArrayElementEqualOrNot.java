public class checkArrayElementEqualOrNot {

    public static void claculateArrayEquals(int a[], int b[], boolean arrayEquals) {

        if (a.length != b.length) {
            arrayEquals = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    arrayEquals = false;
                    break;
                }
            }
        }
        if (arrayEquals) {
            System.out.println("Equl");
        } else {
            System.out.println("Not equl");
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 1, 2, 3, 0, 5 };
        boolean arrayEquals = true;
        claculateArrayEquals(a, b, arrayEquals);
    }
}
