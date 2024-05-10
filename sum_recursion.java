public class sum_recursion {

    int add(int num1, int num2) {

        int c = num1 + num2;

        if (c == 0 || c != 0)
            return c;
        else
            return add(num1, num2);
    }

    public static void main(String[] args) {

        sum_recursion value = new sum_recursion();

        int result = value.add(5, 5);

        System.out.println("Answer: " + result);
    }
}
