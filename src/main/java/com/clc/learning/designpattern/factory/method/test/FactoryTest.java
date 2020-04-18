package com.clc.learning.designpattern.factory.method.test;

import com.clc.learning.designpattern.factory.method.Provider;
import com.clc.learning.designpattern.factory.method.Sender;
import com.clc.learning.designpattern.factory.method.factory.SendMailFactory;

public class FactoryTest {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
