// Move all X at last
public class Recursion12 {
    public static void moveAllX(String str, int index, int count, String newString) {
        if (index == str.length()) {// base case
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.print(newString);
            return;
        }
        char currentChar = str.charAt(index);

        if (currentChar == 'x') {
            count++;
            moveAllX(str, index + 1, count, newString);
        } else {
            newString += currentChar;
            moveAllX(str, index + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "aabbxccxddxgxg";
        moveAllX(str, 0, 0, " ");
    }
}
