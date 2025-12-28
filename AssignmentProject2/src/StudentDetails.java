import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        String name = sc.nextLine();
        int rollNo = sc.nextInt();
        char grade = sc.next().charAt(0);
        String percentage = sc.next();

        // Output (exact format)
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println("\t"+grade);
        System.out.println("\t"+percentage);

        sc.close();
    }
}

