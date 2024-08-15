class Employee {
    float f = 400000;
}

public class inheritence extends Employee {
    int i = 20000;

    public static void main(String[] args) {
        inheritence c = new inheritence();

        System.out.println("Float: " + c.f);
        System.out.println("Int: " + c.i);
    }
}