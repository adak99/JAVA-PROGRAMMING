public class Test {
    public static void main(String[] args) {

        Word word = new Word();
        word.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
