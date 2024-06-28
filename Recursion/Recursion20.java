//Find the number of ways in which you can invite n people to your pary. singel of in pairs

public class Recursion20 {

    public static int callGuest(int n) {
        // base case
        if (n <= 1) {
            return 1;
        }

        // singel way
        int singelWay = callGuest(n - 1);

        // pairs way
        int parisWay = (n - 1) * callGuest(n - 2);

        return singelWay + parisWay;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Total ways: " + callGuest(n));
    }
}