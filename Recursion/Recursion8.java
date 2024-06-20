// Tower of Hanoi **
public class Recursion8 {
    public static void towerOfHanoi(int n, String scorce, String helper, String destination) {

        if (n == 1) { // base case
            // if whare n == 1 then print the statement and return;
            System.out.println("Transfer disk form " + n + " form " + scorce + " to " + destination);
            return;
        }

        // n = n / scorce = scorce / helper = destination / destination = helper
        towerOfHanoi(n - 1, scorce, destination, helper);
        // print statement
        System.out.println("Transfer disk form " + n + " form " + scorce + " to " + destination);
        // n = n / scorce = helper / helper = scorce / destination = destination
        towerOfHanoi(n - 1, helper, scorce, destination);
    }

    public static void main(String[] args) {
        int n = 2;
        towerOfHanoi(n, "scorce", "helper", "destination");
    }
}
