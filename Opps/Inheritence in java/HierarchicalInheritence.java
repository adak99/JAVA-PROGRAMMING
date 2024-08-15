class parent {
    int num1 = 10;
    int num2 = 5;

    void printNum() {
        System.out.println("int: " + num1 + " int: " + num2);
    }
}

class chidl1 extends parent {
    int addition() {
        return num1 + num2;
    }
}

class chidl2 extends parent {
    int subtraction() {
        return num1 - num2;
    }
}

public class HierarchicalInheritence {
    public static void main(String[] args) {
        chidl1 n = new chidl1();
        chidl2 o = new chidl2();

        System.out.println("Child 1 obj:");
        n.printNum(); // printNum is a member function of parent class
        System.out.println("Answer: " + n.addition()); // addition is a member function of child class 1

        System.out.println("\nChild 2 obj:");
        o.printNum();
        System.out.println("Answer: " + o.subtraction());
    }
}