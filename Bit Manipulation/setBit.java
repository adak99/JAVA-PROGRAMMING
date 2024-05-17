public class setBit {
    public static void main(String[] args) {

        int n = 5;
        int pos = 2;
        int bitMask = 2 << pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
