package com.clc.learning.designpattern.decorator.impl;

import com.clc.learning.designpattern.decorator.People;

public class TrouserFinery extends Finery {
    public TrouserFinery(People people){
        super(people);
    }

    @Override
    public void wearClothing() {
        people.wearClothing();
        System.out.println("穿 trouser");
    }
}
