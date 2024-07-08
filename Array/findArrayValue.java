import java.util.Scanner;

public class findArrayValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter inputs: ");
        for (int i = 0; i < size; i++)
            arr[i] = scan.nextInt();

        findMinMaxValue(arr);
        scan.close();
    }

    public static void findMinMaxValue(int arr[]) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(min + " it is the minimum value of the array.");
        System.out.println(max + " it is the maximum value of the array.");
    }
}

// different way =>

import java.util.Arrays;

public class findArrayValue {

    public static void findValue(int arr[]) {
        Arrays.sort(arr);
        int smallestNumber = arr[0];
        int largestNumber = arr[arr.length - 1];

        System.out.println("Most smallest value in the array is: " + smallestNumber);
        System.out.println("Most largest value in the array is: " + largestNumber);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 6, 3, 4 };
        findValue(arr);
    }
}