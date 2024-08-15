public class LinerSearch {
    public static void main(String[] ars) {
        int[] arr = { 1, 2, 6, 7, 5, 4 };
        int target = 6;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print("The Target element found at index: " + i);
                break;
            }
        }
    }
}
