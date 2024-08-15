class Student {
    String name;
    int id;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int id) {
        System.out.println(id);
    }

    public void printInfo(String name, int id) {
        System.out.println(name + " " + id);
    }
}

public class funcOverLoding {
    public static void main(String[] args) {
        Student si = new Student();
        si.name = "soumya";
        si.id = 8;

        System.out.println("public void printInfo(String name) :");
        System.out.print("String: ");
        si.printInfo(si.name);

        System.out.println("\npublic void printInfo(int id): ");
        System.out.print("Int: ");
        si.printInfo(si.id);

        System.out.println("\npublic void printInfo(String name, int id): ");
        si.printInfo(si.name, si.id);
    }
}
