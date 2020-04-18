package com.clc.learning.designpattern.decorator.impl;

import com.clc.learning.designpattern.decorator.People;

public class ShoesFinery extends Finery {
    public ShoesFinery(People people){
        super(people);
    }

    @Override
    public void wearClothing(){
        people.wearClothing();
        System.out.println("穿shoes");
    }
}
