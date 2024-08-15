// singel inheritence

class parent { // parent class
    int num1;
    int num2;

    void Perentaddtion(int x, int y) {
        int result = x + y;
        System.out.println("Perent: " + result);
    }
}

class child extends parent { // child class
    void Childaddtion(int a, int b) {
        int ans = a + b;
        System.out.println("Child : " + ans);
    }
}

public class SingelInheritence {
    public static void main(String[] args) {
        child n = new child();
        n.num1 = 4;
        n.num2 = 5;

        n.Perentaddtion(n.num1, n.num2);
        n.Childaddtion(n.num1, n.num2);
    }
}
