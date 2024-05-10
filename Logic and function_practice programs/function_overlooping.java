public class function_overlooping {

    public void insert(int a, int b) {

        int x = a;
        int y = b;
        int c = a + b;
        System.out.println("Ans:-" + c);
    }

    public static void main(String[] args) {

        function_overlooping a = new function_overlooping();
        a.insert(5, 5);
    }
}
