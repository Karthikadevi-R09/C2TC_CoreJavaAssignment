package com.karthikadevi.assignment.employees;

//extends the Employee class and adds manager-specific details
public class Manager extends Employee {

    private int teamSize;//Number of employees managed by the manager

    
    public Manager() {//Default constructor
        super();
    }

    //Parameterized constructor
    public Manager(String name, int employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    //Gets the team size and return 
    public int getTeamSize() {
        return teamSize;
    }

    //Sets the team size
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
