public class clearBit {
    public static void main(String args[]) {
        int n = 5;
        int position = 2;
        int bitMask = 1 << position;
        int notBitMast = ~(bitMask);

        int newNumber = notBitMast & n;
        System.out.println(newNumber);
    }
}
