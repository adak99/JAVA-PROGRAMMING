import java.util.Scanner;

class student {
    String name;
    int dig, c, esp, sdp, total;
    float grade, avg;

    public void claculategrade() { // Renamed the method to calculateGrade
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter your name:-");
        name = scan.nextLine();
        System.out.println();
        System.out.println(":Enter your marks:-");
        System.out.println("____________________________");
        System.out.println();
        System.out.print("Digital electronics:- ");
        dig = scan.nextInt();
        System.out.print("C programming:- ");
        c = scan.nextInt();
        System.out.print("ESP:- ");
        esp = scan.nextInt();
        System.out.print("SDP:- ");
        sdp = scan.nextInt();
        total = dig + c + esp + sdp;
        System.out.println("Total marks is:- " + total);
        avg = total / 4;
        System.out.println("Avagrage:- " + avg);

        int n = (int) (avg / 10);
        switch (n) {
            case 9:
                System.out.println("Grade: A++");
                break;
            case 8:
                System.out.println("Grade: A");
                break;
            case 7:
                System.out.println("Grade: B++");
                break;
            case 6:
                System.out.println("Grade: B");
                break;
            case 5:
                System.out.println("Grade: Pass");
                break;
            default:
                System.out.println("Grade: Fail");
                break;
        }

        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
        System.out.println("");
    }

}

public class create_multiple_object {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("How many record do you have to enter:- ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        student[] object = new student[number]; // Change the array type to student[]

        for (int i = 0; i < number; i++) {
            object[i] = new student();
            System.out.println(object[i]);

            object[i].claculategrade();
        }

    }
}