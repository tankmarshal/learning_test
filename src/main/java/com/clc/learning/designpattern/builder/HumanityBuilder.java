package com.clc.learning.designpattern.builder;

import java.util.Date;

public class HumanityBuilder {
    private Humanity humanity = new Humanity();
    public Humanity build(){
        return humanity;
    }
    public HumanityBuilder buildName(String name){
        humanity.setName(name);
        return this;
    }

    public HumanityBuilder buildGender(String gender){
        humanity.setGender(gender);
        return this;
    }

    public HumanityBuilder buildAddress(String address){
        humanity.setAddress(address);
        return this;
    }
    public HumanityBuilder buildBirthDate(Date birthDate){
        humanity.setBirthDate(birthDate);
        return this;
    }
}
