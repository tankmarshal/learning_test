package com.clc.learning.designpattern.factory.abstractmethod.factory;

import com.clc.learning.designpattern.factory.abstractmethod.Fruit;
import com.clc.learning.designpattern.factory.abstractmethod.FruitFactory;
import com.clc.learning.designpattern.factory.abstractmethod.impl.ChinaApple;
import com.clc.learning.designpattern.factory.abstractmethod.impl.ChinaBanana;

public class ChinaFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new ChinaApple();
    }

    @Override
    public Fruit getBanana() {
        return new ChinaBanana();
    }
}
