package com.karthikadevi.assignment.employees;

public class Developer extends Employee {//extends from employee class

    
    private String programmingLanguage;// primary step for Developer

    public Developer() { // Default constructor
        super();
    }

    //Parameterized constructor
  
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Get and Return the value
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Sets the programming language
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}

