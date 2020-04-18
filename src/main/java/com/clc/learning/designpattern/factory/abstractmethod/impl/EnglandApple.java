package com.clc.learning.designpattern.factory.abstractmethod.impl;

import com.clc.learning.designpattern.factory.abstractmethod.Apple;

public class EnglandApple extends Apple {

    @Override
    public void get() {
        System.out.println("英国的苹果");
    }
}
