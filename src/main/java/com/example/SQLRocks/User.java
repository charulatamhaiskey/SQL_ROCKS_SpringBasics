package com.example.SQLRocks;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //So that hibernate can identify whose attributes to pick for table creation
@Table(name = "user_info") //This is just for the giving table name , by default : tableName === className
public class User {

    @Id //It is written on that attribute which has to become the primary key
    @Column(unique = true)
    private int id; //id is the primary key :


    @Column(unique = true)
    private String email;

    private String name;

    private String age;

    private String mobNo;

    @Column(name="country_name")
    private String country;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //Always create the default constructor
    public User(){

    }


    //Good practice is to create all args constructor
    public User(int id, String name, String age,String mobNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
    //Creating the getters and setters
    //Shortcut is use Alt + Insert

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}