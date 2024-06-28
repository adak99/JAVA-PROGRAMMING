// print all the subset of a set of first n natural numbers

import java.util.ArrayList;

public class Recursion21 {

    // Print function
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();

    }

    // calcualte funtion
    public static void findSubset(int n, ArrayList<Integer> subset) {
        // base case
        if (n == 0) {
            printSubset(subset);
            return;
        }

        // add
        subset.add(n);
        findSubset(n - 1, subset);

        // do no add
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
