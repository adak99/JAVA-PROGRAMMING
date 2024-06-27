// print all permutations of a string
public class Recursion17 {

    public static void printPermutaion(String str, String permutation) {
        // if base case
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1); // "abc" -> "ac"
            printPermutaion(newString, permutation + currentChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutaion(str, " ");
    }
}
