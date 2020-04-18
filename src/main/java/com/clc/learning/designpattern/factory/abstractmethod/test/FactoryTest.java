package com.clc.learning.designpattern.factory.abstractmethod.test;

import com.clc.learning.designpattern.factory.abstractmethod.Fruit;
import com.clc.learning.designpattern.factory.abstractmethod.FruitFactory;
import com.clc.learning.designpattern.factory.abstractmethod.factory.ChinaFactory;
import com.clc.learning.designpattern.factory.abstractmethod.factory.EnglandFactory;

public class FactoryTest {
    public static void main(String[] args) {
        FruitFactory chinaFactory = new ChinaFactory();
        Fruit apple = chinaFactory.getApple();
        apple.get();
        Fruit banana = chinaFactory.getBanana();
        banana.get();

        FruitFactory englandFactory = new EnglandFactory();
        Fruit englandApple = englandFactory.getApple();
        englandApple.get();
        Fruit englandBanana = englandFactory.getBanana();
        englandBanana.get();
    }
}
