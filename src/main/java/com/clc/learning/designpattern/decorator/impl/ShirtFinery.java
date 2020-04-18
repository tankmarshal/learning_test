package com.clc.learning.designpattern.decorator.impl;

import com.clc.learning.designpattern.decorator.People;

public class ShirtFinery extends Finery {
    public ShirtFinery(People people){
        super(people);
    }

    public void wearClothing(){
        people.wearClothing();
        System.out.println("穿 shirt");
    }
}
