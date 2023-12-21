public class recursion_sum {

    int add(int num1, int num2) {

        int c = num1 + num2;
        return c;
    }

    public static void main(String[] args) {

        recursion_sum r = new recursion_sum();

        int result = r.add(6, 4);

        System.out.println("Answer:- " + result);
    }
}
