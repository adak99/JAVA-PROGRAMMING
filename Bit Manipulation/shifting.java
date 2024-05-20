public class shifting {
    public static void main(String args[]) {

        // 8 >> 1; right shift

        int x = 8;
        int y = 1;
        int z = x >> y;

        System.out.println("8 >> 1 : " + z);

        // 8 >> 2; right shift

        int a = 8;
        int b = 2;
        int c = a >> b;

        System.out.println("8 >> 2 : " + c);

        // 8 << 1;

        int d = 8;
        int e = 1;
        int f = d << e;

        System.out.println("8 << 1 : " + f);

        // 8 << 2;
        int g = 8;
        int h = 2;
        int i = g << h;

        System.out.println("8 << 2 : " + i);
    }
}