public class findArrayEquals {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = { 1, 2, 3, 4, 5, 6 };

        boolean arrayEquals = true;

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
            System.out.println("Array are equal.");
        } else {
            System.out.println("Array not equal.");
        }
    }
}
