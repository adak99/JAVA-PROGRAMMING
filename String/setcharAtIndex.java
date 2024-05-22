//set char at index example2
public class setcharAtIndex {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("nodejs"); // python

        sb.setCharAt(0, 'p');
        sb.setCharAt(1, 'y');
        sb.setCharAt(2, 't');
        sb.setCharAt(3, 'h');
        sb.setCharAt(4, 'o');
        sb.setCharAt(5, 'n');

        System.out.println(sb);
    }
}
