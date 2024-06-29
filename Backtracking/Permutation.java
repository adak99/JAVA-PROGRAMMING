//Arrange them in a single line "ABC"

public class Permutation {

    public static void printPermutaion(String str, String permutation, int index) {
        // base case
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermutaion(newString, permutation + currentChar, index + 1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutaion(str, "", 0);
    }
}
