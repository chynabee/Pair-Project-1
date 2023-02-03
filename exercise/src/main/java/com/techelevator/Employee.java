package com.techelevator;

public class Employee {

    private final static double defaultSalary = 60000;

    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;


//Constructors

    public Employee(long employeeId, String firstName, String lastName, String email, Department department, String hireDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
    }

    public Employee() {

    }

    //Getters
    public long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Department getDepartment() {
        return department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullName() {
        return "" + lastName + ", " + firstName + "";
    }

    //Setters
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }


    //Methods
    public void getFullName(String lastName, String firstName) {
        this.getFullName();
    }

    public void raiseSalary (double percent) {
        this.salary = (salary * (percent) / 100) + salary));
    }

}
