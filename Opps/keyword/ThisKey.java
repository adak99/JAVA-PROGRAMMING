public class ThisKey {
    String name;
    int no;

    ThisKey(String name, int no) {
        this.name = name;
        this.no = no;

        System.out.println(this.name);
        System.out.println(this.no);
    }

    public static void main(String[] args) {
        ThisKey n = new ThisKey("Soumya", 78);
    }
}
