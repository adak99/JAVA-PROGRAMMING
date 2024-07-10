public class addTowMatrix {

    public static void printMatrix(int print[][]) {
        for (int i = 0; i < print.length; i++) {
            for (int j = 0; j < print.length; j++) {
                System.out.print(print[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrix(int a[][], int b[][]) {
        int addArrya[][] = new int[a.length][b.length];

        for (int i = 0; i < addArrya.length; i++) {
            for (int j = 0; j < addArrya.length; j++) {
                addArrya[i][j] = a[i][j] + b[i][j];
            }
        }
        return addArrya;
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };
        System.out.println("Matrix A: ");
        printMatrix(a);

        int b[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };
        System.out.println("\nMatrix B: ");
        printMatrix(b);

        int addArrya[][] = addMatrix(a, b);
        System.out.println("\nAdd tow matrix final result: ");
        printMatrix(addArrya);
    }
}
