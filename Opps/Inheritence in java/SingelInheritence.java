// singel inheritence

class parent { // parent class
    int num1;
    int num2;

    int Parentaddition(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        return num1 + num2;
    }
}

class child extends parent { // child class
    int addition() {
        return num1 + num2;
    }
}

public class SingelInheritence {
    public static void main(String[] args) {
        child n = new child();
        n.num1 = 4;
        n.num2 = 5;

        int perentClass = n.Parentaddition(n.num1, n.num2);
        int childClass = n.addition();

        System.out.println(perentClass);
        System.out.println(childClass);
    }
}
