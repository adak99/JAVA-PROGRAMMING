import java.util.*;

public class updateBit {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the bit (Set/clear) : ");
        int bit = scan.nextInt();
        int n = 5; // 0101
        int position = 1;
        int bitMask = 1 << position;

        if (bit == 1) {
            int newNumber = bitMask | n;
            System.out.println("The update bit is: " + newNumber);
        } else {
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            System.out.println("The update bit is: " + newNumber);
        }

        scan.close();
    }
}
