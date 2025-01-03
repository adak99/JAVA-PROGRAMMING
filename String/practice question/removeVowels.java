import java.util.HashSet;

public class removeVowels {
    public static void method_1(String str) {
        StringBuilder resutl = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'
                    || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                continue;
            } else {
                resutl.append(ch);
            }
        }
        System.out.println(resutl.toString());
    }

    public static void method_2(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) == -1) {
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }

    public static void method_3(String str) {
        StringBuilder resutl = new StringBuilder();

        HashSet<Character> vowels = new HashSet<>();
        char vol[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

        for (int i = 0; i < vol.length; i++) {
            vowels.add(vol[i]);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!vowels.contains(ch)) {
                resutl.append(ch);
            }
        }

        System.out.println(resutl.toString());
    }

    public static void main(String[] args) {
        String str = "Hello I am Soumya";
        method_1(str);
        method_2(str);
        method_3(str);
    }
}
