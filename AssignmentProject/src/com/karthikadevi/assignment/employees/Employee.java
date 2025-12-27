package com.karthikadevi.assignment.employees;

//encapsulation by using private variable and public getter & setter methods
public class Employee {

    
    private String name;//Name of the employee 

    private int employeeId;//Unique employee ID

    private double salary;// Salary of the employee 
    
    public Employee() { // default
    }

    //Parameterized constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    //Gets the employee name and return the employee name
    public String getName() {
        return name;
    }
    
    //Sets the employee name
    public void setName(String name) {
        this.name = name;
    }

    //Gets the employee ID and return the employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    //Sets the employee ID
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    //Gets the employee salary and return the employee salary
    public double getSalary() {
        return salary;
    }

    //Sets the employee salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
