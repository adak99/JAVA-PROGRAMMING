public class recursion {

    int cal(int fact) { // find a factorial number using recursion

        if (fact == 1) {
            return 1;
        } else {
            return fact * cal(fact - 1);
        }
    }

    public static void main(String[] args) {

        recursion y = new recursion();
        int result = y.cal(6);
        System.out.println(result);
    }
}
