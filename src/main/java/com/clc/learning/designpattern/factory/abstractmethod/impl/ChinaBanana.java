package com.clc.learning.designpattern.factory.abstractmethod.impl;

import com.clc.learning.designpattern.factory.abstractmethod.Banana;
import com.clc.learning.designpattern.factory.abstractmethod.Fruit;

public class ChinaBanana extends Banana {
    @Override
    public void get() {
        System.out.println("中国的香蕉");
    }
}
