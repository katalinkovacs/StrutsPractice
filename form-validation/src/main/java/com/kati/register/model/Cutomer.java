package com.kati.register.model;


public class Cutomer {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String aMessage()
    {
        return "First Name: " + getFirstName() + " Last Name:  " + getLastName();
    }
}
