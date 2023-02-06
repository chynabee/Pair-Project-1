package com.techelevator;


import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Application {

    /**
     * The main entry point in the application
     * @param args
     */


    Map<String, Integer> department = new HashMap<>();

 public class departments {
        List<Department>
    }
    public void printDepartments(String Marketing, String Sales, String Engineering) {
        System.out.print();
    }



    private void run() {
        // create some departments
        createDepartments();
        department.put ("Marketing", 1);
        department.put ("Sales", 2);
        department.put ("Engineering", 3);


        // print each department by name
        printDepartments();


        // create employees
        createEmployees();


        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page com.techelevator.Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        // Dean Johnson
        //Angie Smith
        //Margaret Thompson
        // Is this right does this go here? Or somewhere above?

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
