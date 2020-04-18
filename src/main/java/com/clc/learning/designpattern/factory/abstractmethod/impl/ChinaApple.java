package com.clc.learning.designpattern.factory.abstractmethod.impl;

import com.clc.learning.designpattern.factory.abstractmethod.Apple;

public class ChinaApple extends Apple{
    @Override
    public void get() {
        System.out.println("中国的苹果");
    }
}
