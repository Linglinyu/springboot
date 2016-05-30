package com.thanks.lyq.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mac on 16/5/20.
 */
@Entity
public class Employee {
    private @Id String id;
    private String firstName, lastName, description;


    private Employee() {}

    public Employee(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }

    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName(){
        return  this.lastName;
    }
    public String getDescription(){
        return this.description;
    }
    public String getId() {
        return this.id;
    }

    String a;
    public String getA(){
        return a;
    }

}

