package com.clc.learning.designpattern.factory.sample.staticmethod.impl;

import com.clc.learning.designpattern.factory.sample.staticmethod.Sender;

public class MailSender implements Sender {

    public void send(){
        System.out.println("send mail");
    }
}
