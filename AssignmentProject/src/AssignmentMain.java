import com.karthikadevi.assignment.employees.Manager;
import com.karthikadevi.assignment.employees.Developer;
import com.karthikadevi.assignment.utilities.EmployeeUtilities;

//Main class to run Employee assignment
public class AssignmentMain {

// Main method – program execution starts here
    public static void main(String[] args) {

        // Manager object 
        Manager manager = new Manager("Karthikadevi", 101, 75000.0, 5);

        // Developer object
        Developer developer = new Developer("Anitha", 102, 60000.0, "Java");

        // Display Manager details
        System.out.println("Manager Details");
        EmployeeUtilities.displayManagerDetails(manager);

        // Display Developer details
        System.out.println("\nDeveloper Details");
        EmployeeUtilities.displayDeveloperDetails(developer);

        // Increase salary
        EmployeeUtilities.increaseSalary(manager, 5000);
        EmployeeUtilities.increaseSalary(developer, 3000);

        // Display updated salary
        System.out.println("\nUpdated Salaries ");
        System.out.println("Manager Salary: " + manager.getSalary());
        System.out.println("Developer Salary: " + developer.getSalary());
    }
}

