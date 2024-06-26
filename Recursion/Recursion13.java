// Remove duplicates in a string
public class Recursion13 {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(index);

        if (map[currentChar - 'a'] == true) {
            removeDuplicates(str, index + 1, newString);
        } else {
            newString += currentChar;
            map[currentChar] = true;
            removeDuplicates(str, index, newString);
        }
    }

    public static void main(String[] args) {
        String str = "aabbcc";
        removeDuplicates(str, 0, "");
    }
}
