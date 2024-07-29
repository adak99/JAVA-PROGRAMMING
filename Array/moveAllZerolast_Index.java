public class moveAllZerolast_Index {
    // conqurer
    public static void conqurer(int arr[], int si, int mid, int ei) {
        int newArray[] = new int[ei - si + 1];
    }

    // divide function
    public static void divide(int arr[], int si, int ei) {

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid); // first part
        divide(arr, mid + 1, ei); // secodn part
        conqurer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 1, 6, 5, 9, 8, 7 };

        divide(arr, 0, arr.length - 1);
    }
}
