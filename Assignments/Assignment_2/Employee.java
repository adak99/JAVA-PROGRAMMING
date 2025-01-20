package Assignment_2;

public class Employee {
    public double netSalary(double salary, double tax) {
        return salary - tax;
    }

    public char grade(char grade) {
        return grade;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        double salary = 60000.0;
        double tax = 1000.0;
        char grade = 'A';

        System.out.println("Net salary: " + emp.netSalary(salary, tax));
        System.out.println("Employee grade: " + emp.grade(grade));
    }
}