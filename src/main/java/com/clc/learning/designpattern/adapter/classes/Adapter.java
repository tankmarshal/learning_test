package com.clc.learning.designpattern.adapter.classes;

public class Adapter extends Source implements Targetable {
    @Override
    public void request() {
        method1();
        System.out.println("this is the targetable method!");
    }

}
