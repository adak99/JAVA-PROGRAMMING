//find mini and max value in java

import java.util.Scanner;

public class findArrayValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int number[] = new int[size];

        System.out.println("Enter array inputs: ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        int max = number[0];
        int min = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }

            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println("The min value of the array is: " + min);
        System.out.println("The max value of the array is: " + max);
    }

    public void myMedhod() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'myMedhod'");
    }
}
