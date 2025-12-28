import java.util.Scanner;

public class Commission {

    
    String Name;
    String Address;
    String Phone;
    double Sales_amount;

    // Method to accept details
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        Name = sc.nextLine();
        System.out.print("Enter Address: ");
        Address = sc.nextLine();
        System.out.print("Enter Phone : ");
        Phone = sc.nextLine();
        if (Phone.length() != 10 || !Phone.matches("\\d+")) {
            System.out.println("Invalid phone number. Must be exactly 10 digits.");
            return; 
        }
        System.out.print("Enter Sales_amount: ");
        Sales_amount = sc.nextDouble();
    }

    // Method to calculate commission
    void calculateCommission() {

        double commission;

        if (Sales_amount >= 100000) {
            commission = Sales_amount * 0.10;
        } else if (Sales_amount >= 50000) {
            commission = Sales_amount * 0.05;
        } else if (Sales_amount >= 30000) {
            commission = Sales_amount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("Commission: " + commission);
    }

    // Main method
    public static void main(String[] args) {
        Commission c = new Commission();
        c.acceptDetails();
        c.calculateCommission();
    }
}

