import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        double distance = scan.nextDouble();

        System.out.print("Enter hours: ");
        int hours = scan.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = scan.nextInt();

        System.out.print("Enter seconds: ");
        int seconds = scan.nextInt();

        double totalSeconds = (hours * 3600) + (minutes * 60) + seconds;  

        double speedMeterPerSecond = distance / totalSeconds;  
        double speedKilometerPerHour = (distance / 1000.0) / (totalSeconds / 3600.0);
        double speedMilesPerHour = (distance / 1609.0) / (totalSeconds / 3600.0);  

       
        System.out.println("Speed in meters/second: " + speedMeterPerSecond + " m/s");
        System.out.println("Speed in kilometers/hour: " + speedKilometerPerHour + " km/h");  
        System.out.println("Speed in miles/hour: " + speedMilesPerHour + " mph");  

        scan.close();  
    }
}
