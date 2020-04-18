package com.clc.learning.designpattern.decorator.impl;

import com.clc.learning.designpattern.decorator.People;

public class Man implements People {

    private String gender;

    @Override
    public void wearClothing() {
        System.out.println("开始穿衣服.");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
