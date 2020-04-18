package com.clc.learning.designpattern.decorator.impl;

import com.clc.learning.designpattern.decorator.People;

public abstract class Finery implements People {
    protected People people;
    public Finery(People people){
        this.people = people;
    }
    @Override
    public abstract void wearClothing();
}
