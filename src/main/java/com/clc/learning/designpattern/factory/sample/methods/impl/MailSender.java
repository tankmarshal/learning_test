package com.clc.learning.designpattern.factory.sample.methods.impl;

import com.clc.learning.designpattern.factory.sample.methods.Sender;

public class MailSender implements Sender {

    public void send(){
        System.out.println("send mail");
    }
}
