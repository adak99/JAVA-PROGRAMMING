//Delete Char 

public class deleteChar {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("hello");

        sb.delete(2, 3);
        System.out.println(sb);
    }
}
