package com.clc.learning.designpattern.factory.sample.staticmethod.test;

import com.clc.learning.designpattern.factory.sample.staticmethod.Sender;
import com.clc.learning.designpattern.factory.sample.staticmethod.factory.SenderFactory;

public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SenderFactory.produceMail();
        sender.send();
    }
}
