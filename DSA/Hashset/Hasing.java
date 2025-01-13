import java.util.HashSet;

public class Hasing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // insert
        int[] value = { 8, 9, 45, 89, 1, 8 };

        for (int key : value) {
            set.add(key);
        }

        // searching
        for (int key : set) {
            if (set.contains(key)) {
                System.out.print(key + " ");
            }
        }
    }
}
