import java.util.HashSet;
import java.util.Set;

public class removeVowels {
    public static void main(String[] args) {
        String input = "Hello";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U')
                continue;
            else
                result.append(ch);
        }

        System.out.println(result);

        // using hasset

        // Set<Character> vowles = new HashSet<>();
        // char vol[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

        // for (int i = 0; i < vol.length; i++) {
        // vowles.add(vol[i]);
        // }

        // for (int i = 0; i < input.length(); i++) {
        // char ch = input.charAt(i);
        // if (!vowles.contains(ch)) {
        // result.append(ch);
        // }
        // }

        // System.out.println(result);

    }
}