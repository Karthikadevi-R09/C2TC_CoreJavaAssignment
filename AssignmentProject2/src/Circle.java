import java.util.Scanner;

public class Circle {

    double radius;
    String colour;

    // Method to accept input
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        System.out.print("Enter colour: ");
        colour = sc.next();
    }

    // Method to calculate area
    void calcArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.getInput();
        c.calcArea();
    }
}
