import java.util.Arrays;

public class AnagramOrNot {

    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "Lisent";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("Both string are anagram.");
        } else {
            System.out.println("Both string are not anagram.");
        }
    }
}
