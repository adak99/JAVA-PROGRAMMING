// Find the 1st and last occurance of an element in string
public class Recursion10 {
    // static approch
    public static int firstIndex = -1; // this decleard as a global variable
    public static int lastIndex = -1; // this decleard as a global variable

    // Daynamic approch
    public static void findOccrance(String str, int index, char element) {
        if (index == str.length()) { // base case
            System.out.println(firstIndex);
            System.out.println(lastIndex);
            return;
        }

        char currentElement = str.charAt(index);

        if (currentElement == element) {
            if (firstIndex == -1) {
                firstIndex = index;
            } else {
                lastIndex = index;
            }
        }

        findOccrance(str, index + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaahabba";
        char element = 'a';
        findOccrance(str, 0, element);
    }
}
