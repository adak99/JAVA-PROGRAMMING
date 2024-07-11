public class transposeArray {
    // print origianl matrix
    public static void printOriginalArray(int printArray[][]) {
        for (int i = 0; i < printArray.length; i++) {
            for (int j = 0; j < printArray.length; j++) {
                System.out.print(printArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    // modify the matrix
    public static int[][] modifyArray(int transpose[][], int arr[][]) {
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose.length; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // matrix

        System.out.println("Print original matrix: ");
        printOriginalArray(arr); // print original matrix function call

        int row = arr.length;
        int col = arr[0].length;
        int transpose[][] = new int[row][col];
        modifyArray(transpose, arr); // modify matrix function call

        System.out.println("\nPrint modify matrix: ");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
