package abstraction;

public class Main {
    public static void main(String[] args) {

        // method 3
        Dog d = new Dog();
        Cat c = new Cat();

        d.speek();
        c.speek();

        // method 2
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.speek();
        cat.speek();
    }
}
