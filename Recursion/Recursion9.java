//Print a string in reverse
public class Recursion9 {
    public static void printStringReverse(String str, int index) {
        if (index == 0) { // base case
            System.out.print(str.charAt(index) + " ");
            return;
        }
        System.out.print(str.charAt(index) + " ");
        printStringReverse(str, index - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        printStringReverse(str, str.length() - 1);
    }
}
