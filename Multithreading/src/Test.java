public class Test {
    public static void main(String[] args) {

        Word n = new Word();
        n.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
