import java.util.LinkedList;

public class LL {

    private LinkedList<Integer> list;

    public LL() {
        list = new LinkedList<>();
    }

    public void insertFirst(int val) {
        list.addFirst(val);
    }

    public void display() {
        for (int value : list) {
            System.out.print(value + " -> ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        LL n = new LL();
        n.insertFirst(3);
        n.insertFirst(4);
        n.insertFirst(5);
        n.insertFirst(6);
        n.insertFirst(7);
        n.insertFirst(8);

        n.display();
    }
}
