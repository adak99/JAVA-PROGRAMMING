//package JAVA-PROGRAMMING.Bit Manipulation;

public class shifting {
    public static void main(String args[]) {

        // left shift (<<)
        int a = 8; // initial value
        int b = 2; // bit masking value
        int c = a << b; // c = a left shit b (8*2*2)

        System.out.println("\nleft shift: " + c);
        System.out.println("8*2*2\n");
        // right shift (>>)
        int x = 8;
        int y = 2;
        int z = x >> y; // z = a right shift b (8/2/2)

        System.out.println("right shift: " + z);
        System.out.println("8/2/2\n");

    }
}
