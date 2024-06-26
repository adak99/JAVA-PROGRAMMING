//Print all the subsequences of a string

public class Recursion14 {

    public static void subsequences(String str, int index, String newString) {
        // base case
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(index);

        // to be
        subsequences(str, index + 1, newString + currentChar);
        // or not to be
        subsequences(str, index + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, " ");
    }
}
