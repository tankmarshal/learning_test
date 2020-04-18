package com.clc.learning.designpattern.factory.abstractmethod.factory;

import com.clc.learning.designpattern.factory.abstractmethod.Fruit;
import com.clc.learning.designpattern.factory.abstractmethod.FruitFactory;
import com.clc.learning.designpattern.factory.abstractmethod.impl.EnglandApple;
import com.clc.learning.designpattern.factory.abstractmethod.impl.EnglandBanana;

public class EnglandFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new EnglandApple();
    }

    @Override
    public Fruit getBanana() {
        return new EnglandBanana();
    }
}
