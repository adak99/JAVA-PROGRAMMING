//package Constructor in java;
class Student {
    String name;
    int id;

    // create constructor
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void printDetails() {
        System.out.println(this.name);
        System.out.println(this.id);
    }
}

public class cons2 {
    public static void main(String[] args) {
        Student call = new Student("Soumya", 355);
        call.printDetails();
    }
}
