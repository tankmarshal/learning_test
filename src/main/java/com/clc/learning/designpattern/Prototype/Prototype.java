package com.clc.learning.designpattern.Prototype;

public class Prototype implements Cloneable{
    public Object clone() throws CloneNotSupportedException{
        Prototype prototype = (Prototype)super.clone();
        return prototype;
    }
}
