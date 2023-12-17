public class method_overloading {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double c, double d) {
        return c + d;
    }

    static char add(char a, char b) {
        return b;

    }

    public static void main(String[] args) {

        int x = add(3, 2);
        System.out.println("Answer:- " + x);

        double y = add(5, 6);
        System.out.println("Answer:- " + (int) y);

        char z = add('s', 'a');
        System.out.println("Answer:- " + z);
    }
}
