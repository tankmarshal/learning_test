package com.clc.learning.designpattern.decorator.test;

import com.clc.learning.designpattern.decorator.People;
import com.clc.learning.designpattern.decorator.impl.Finery;
import com.clc.learning.designpattern.decorator.impl.Man;
import com.clc.learning.designpattern.decorator.impl.ShirtFinery;
import com.clc.learning.designpattern.decorator.impl.ShoesFinery;

public class DecoratorTest {
    public static void main(String[] args) {
        People people = new Man();
        Finery shirtFinery = new ShirtFinery(people);
        Finery shoesFinery = new ShoesFinery(people);
        shirtFinery.wearClothing();
    }
}
