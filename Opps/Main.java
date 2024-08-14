class pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void typeOfpen() {
        System.out.println(this.type);
    }
}

public class Main {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen pen2 = new pen();

        pen1.color = "blue";
        pen1.type = "jel";

        pen2.color = "yellow";
        pen2.type = "Ball";

        pen1.write();
        pen1.printColor();
        pen1.typeOfpen();

        pen2.printColor();
        pen2.typeOfpen();

    }
}
