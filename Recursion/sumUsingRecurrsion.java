public class sumUsingRecurrsion {

    int add(int num1, int num2) {
        int c = num1 + num2;

        if (c != 0 || c == 0) {
            return c;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        sumUsingRecurrsion output = new sumUsingRecurrsion();

        int result = output.add(2, 3);
        System.out.println("Answer: " + result);
    }
}
