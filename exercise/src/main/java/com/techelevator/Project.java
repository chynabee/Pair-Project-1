package com.techelevator;

import java.awt.*;

public class Project {


    private String name;
    private String description;
    private String startDate;
    private String dueDate;
    private List<Employee> teamMembers;


    //Constructors
    public Project(String name, String description, String startDate, String dueDate) {

    }

//Getters

    public String getName() {
        this.name = name;
    }

    public String getDescription() {
        this.description = description;
    }

    public String getStartDate() {
        this.startDate = startDate;
    }

    public String getDueDate() {
        this.dueDate = dueDate;
    }

    public List<Employee> getTeamMembers() {
        return teamMembers;
    }


    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setTeamMembers(List<> teamMembers) {
        this.teamMembers = teamMembers;
    }


}
