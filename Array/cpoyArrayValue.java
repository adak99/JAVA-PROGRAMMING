import java.util.*;

public class cpoyArrayValue {

    public static void printArray(int a[], int b[]) {

        b = a;

        System.out.print("\n The element of arry of a[] is: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.print("\n\n The element of array of b[] is: ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int a[] = new int[size];
        int b[] = new int[a.length];

        System.out.print("Enter inputs: ");
        for (int i = 0; i < size; i++)
            a[i] = scan.nextInt();

        printArray(a, b);
        scan.close();
    }
}
