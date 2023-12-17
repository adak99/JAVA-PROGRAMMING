import java.util.Scanner;

class student {
    String name;
    int beng, eng, math, geo, coma, total;
    float grade, avg;

    public void claculategrade() {
        Scanner scan = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter your name:-");
        name = scan.nextLine();

        System.out.println();

        System.out.println(":Enter your marks:");

        System.out.println("____________________________");
        System.out.println();
        System.out.print("Bengali:- ");
        beng = scan.nextInt();
        System.out.print("English:- ");
        eng = scan.nextInt();
        System.out.print("Mathematics:- ");
        geo = scan.nextInt();
        System.out.print("Computer Application:- ");
        coma = scan.nextInt();
        total = beng + eng + math + geo + coma;
        System.out.println("Total marks is:- " + total);
        avg = total / 5;
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
    }

}

public class create_object {
    public static void main(String[] args) {
        student soumya = new student();

        System.out.println(soumya);

        soumya.claculategrade();

    }
}