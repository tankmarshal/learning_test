package com.clc.learning.designpattern.factory.sample.methods.test;

import com.clc.learning.designpattern.factory.sample.methods.Sender;
import com.clc.learning.designpattern.factory.sample.methods.factory.SenderFactory;

public class FactoryTest {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }
}
