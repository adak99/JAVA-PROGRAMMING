class Parent { // Parent class
    int num1;
    int num2;

    void print() {
        System.out.println("int: " + num1 + " int: " + num2);
    }
}

class Child1 extends Parent { // Child class 1
    int addition() {
        return num1 + num2;
    }
}

class Child2 extends Child1 { // Chidl class 2
    int subtraction() {
        return addition() - 2;
    }
}

public class MultiLavelInheritance {
    public static void main(String[] args) {
        Child2 c = new Child2();

        c.num1 = 10;
        c.num2 = 6;

        c.print();
        int resultAddition = c.addition();
        int resultSubtraction = c.subtraction();

        System.out.println("Addition: " + resultAddition);
        System.out.println("Subtraction: " + resultSubtraction);

    }
}
