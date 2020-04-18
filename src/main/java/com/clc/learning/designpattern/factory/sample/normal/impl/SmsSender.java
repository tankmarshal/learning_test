package com.clc.learning.designpattern.factory.sample.normal.impl;

import com.clc.learning.designpattern.factory.sample.normal.Sender;

public class SmsSender implements Sender {

    public void send() {
        System.out.println("send sms");
    }
}
