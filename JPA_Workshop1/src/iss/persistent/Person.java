package iss.persistent;

import java.io.PrintWriter;

import javax.persistence.*;

@MappedSuperclass
public class Person {

    private String surname;
    private String firstName;
    private String secondName;
    
    public Person() {}

    public Person (String surname, String firstName, String secondName) {
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String surname) {
    	this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }
    
    public void setSecondName(String secondName) {
    	this.secondName = secondName;
    }

    public String toString () {
        String fullName = firstName;
        if (secondName != null) {
            fullName += " " + secondName;
        }
        fullName += " " + surname;
        return (fullName);
    }

    public void show () {
        System.out.println (this);
    }

    public void show (PrintWriter pw)
    {
        pw.println (this);
    }
}
