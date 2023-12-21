public class recursion_sum { // method overloading

    int add(int num1, int num2) {

        int c = num1 + num2;

        if (c != 0 || c == 0)
            return c;

        else
            return add(num1, num2);
    }

    public static void main(String[] args) {

        recursion_sum r = new recursion_sum();

        int result = r.add(0, 0);

        System.out.println("Answer:- " + result);
    }
}
