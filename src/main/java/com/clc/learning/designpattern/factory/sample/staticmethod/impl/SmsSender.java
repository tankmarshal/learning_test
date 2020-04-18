package com.clc.learning.designpattern.factory.sample.staticmethod.impl;

import com.clc.learning.designpattern.factory.sample.staticmethod.Sender;

public class SmsSender implements Sender {

    public void send() {
        System.out.println("send sms");
    }
}
