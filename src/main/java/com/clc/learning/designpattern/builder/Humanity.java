package com.clc.learning.designpattern.builder;

import java.util.Date;

public class Humanity {
    private String name;
    private String gender;
    private String address;
    private Date birthDate;

    public Humanity(){

    }

    public Humanity(String name,String gender,String address,Date birthDate){
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
