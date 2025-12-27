package com.karthikadevi.assignment.utilities;

import com.karthikadevi.assignment.employees.Employee;
import com.karthikadevi.assignment.employees.Manager;
import com.karthikadevi.assignment.employees.Developer;

 //Utility class that provides helper methods 
 //to work with Employee, Manager, and Developer objects
 
public class EmployeeUtilities {

    //Displays basic employee details
    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    //Increases the salary of an employee
    public static void increaseSalary(Employee employee, double increment) {
        employee.setSalary(employee.getSalary() + increment);
    }

    //Displays manager-specific details
    public static void displayManagerDetails(Manager manager) {
        displayEmployeeDetails(manager);
        System.out.println("Team Size: " + manager.getTeamSize());
    }

    //Displays developer-specific details
    public static void displayDeveloperDetails(Developer developer) {
        displayEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}

