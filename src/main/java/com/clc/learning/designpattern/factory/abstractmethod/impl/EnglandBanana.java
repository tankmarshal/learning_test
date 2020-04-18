package com.clc.learning.designpattern.factory.abstractmethod.impl;

import com.clc.learning.designpattern.factory.abstractmethod.Banana;

public class EnglandBanana extends Banana {
    @Override
    public void get() {
        System.out.println("英国的香蕉");
    }
}
