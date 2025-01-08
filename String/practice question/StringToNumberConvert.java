import java.util.HashMap;
import java.util.Map;

public class StringToNumberConvert {

    public static long wordToNumber(String input) {
        Map<String, Integer> numberMap = new HashMap<>();

        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);
        numberMap.put("ten", 10);
        numberMap.put("eleven", 11);
        numberMap.put("twelve", 12);
        numberMap.put("thirteen", 13);
        numberMap.put("fourteen", 14);
        numberMap.put("fifteen", 15);
        numberMap.put("sixteen", 16);
        numberMap.put("seventeen", 17);
        numberMap.put("eighteen", 18);
        numberMap.put("nineteen", 19);
        numberMap.put("twenty", 20);
        numberMap.put("thirty", 30);
        numberMap.put("forty", 40);
        numberMap.put("fifty", 50);
        numberMap.put("sixty", 60);
        numberMap.put("seventy", 70);
        numberMap.put("eighty", 80);
        numberMap.put("ninety", 90);
        numberMap.put("hundred", 100);
        numberMap.put("thousand", 1000);

        String[] words = input.toLowerCase().split(" ");
        long result = 0;
        long currentNumber = 0;

        for (String word : words) {
            if (numberMap.containsKey(word)) {
                int value = numberMap.get(word);
                if (value == 0 || value == 100) {
                    currentNumber *= value;
                } else {
                    currentNumber += value;
                }
            }
        }
        result += currentNumber;
        return result;
    }

    public static void main(String[] args) {
        String input = "Three hundred";
        long output = wordToNumber(input);
        System.out.println(output);
    }
}