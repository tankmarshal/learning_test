package com.clc.learning.designpattern.factory.method.impl;


import com.clc.learning.designpattern.factory.method.Sender;

public class MailSender implements Sender {

    public void send(){
        System.out.println("send mail");
    }
}
