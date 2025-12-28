import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter choice (1-AirIndia, 2-KingFisher, 3-Indigo): ");
        int choice = sc.nextInt();

        System.out.print("Enter hours of travel: ");
        int hours = sc.nextInt();

        System.out.print("Enter cost per hour: ");
        double costPerHour = sc.nextDouble();

        Airfare airfare = null;

        if (choice == 1) {
            airfare = new AirIndia(hours, costPerHour);
        } else if (choice == 2) {
            airfare = new KingFisher(hours, costPerHour);
        } else if (choice == 3) {
            airfare = new Indigo(hours, costPerHour);
        }

        double amount = airfare.calculateAmount();
        System.out.printf("Total Amount: %.2f", amount);

        sc.close();
    }
}


