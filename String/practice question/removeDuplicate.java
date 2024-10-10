import java.util.HashSet;

public class removeDuplicate {
    public static void usingLoop(String str, String newStr) {
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                newStr += str.charAt(i);
            }
        }

        System.out.println(newStr);
    }

    public static void usingHashSet(String str, String newStr) {
        HashSet<Character> n = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!n.contains(currentChar)) {
                newStr += currentChar;
                n.add(currentChar);
            }
        }

        System.out.println(newStr);
    }

    public static void main(String[] args) {
        String str = "hello";
        String newStr = "";

        usingLoop(str, newStr); // usign loop
        usingHashSet(str, newStr); // using hastset
    }
}
