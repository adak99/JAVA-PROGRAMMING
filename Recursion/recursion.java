public class recursion {

    int cal(int a) {

        if (a == 1) {
            return 1;
        } else {
            return a * cal(a - 1);
        }
    }

    public static void main(String[] args) {

        recursion output = new recursion();

        int result = output.cal(4);
        System.out.println(result);
    }
}
