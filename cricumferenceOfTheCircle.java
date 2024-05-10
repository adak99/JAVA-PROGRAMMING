import java.util.Scanner;

public class cricumferenceOfTheCircle {

    private static double calculate(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        double radius;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the circle radius: ");
        radius = scan.nextDouble();

        System.out.println("Circumference of the circle is : : " + calculate(radius));
    }
}