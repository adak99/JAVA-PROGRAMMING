public class setBit {
    public static void main(String[] args) {
        int n = 5; // 0101;
        int position = 1;
        int bitMask = 1 << position;

        int newNumber = bitMask | n;
        System.out.println(newNumber); // output was 7 and its bainary from is 0111
    }
}