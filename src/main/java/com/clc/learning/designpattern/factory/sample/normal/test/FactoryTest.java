package com.clc.learning.designpattern.factory.sample.normal.test;

import com.clc.learning.designpattern.factory.sample.normal.Sender;
import com.clc.learning.designpattern.factory.sample.normal.factory.SenderFactory;

public class FactoryTest {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produce("mail");
        sender.send();
    }
}
