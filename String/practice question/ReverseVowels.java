public class ReverseVowels {
    public static void main(String[] args) {
        String str = "hello";
        String vowles = "aeiouAEIOU";
        char[] character = str.toCharArray();
        int leftIdx = 0;
        int rightIdx = character.length - 1;

        while (leftIdx < rightIdx) {
            while (leftIdx < rightIdx && vowles.indexOf(character[leftIdx]) == -1)
                leftIdx++;
            while (leftIdx < rightIdx && vowles.indexOf(character[rightIdx]) == -1)
                rightIdx--;

            if (leftIdx < rightIdx) {
                char temp = character[leftIdx];
                character[leftIdx] = character[rightIdx];
                character[rightIdx] = temp;
                leftIdx++;
                rightIdx--;
            }
        }

        System.out.println(new String(character));
    }
}
