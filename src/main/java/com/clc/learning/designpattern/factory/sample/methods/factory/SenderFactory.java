package com.clc.learning.designpattern.factory.sample.methods.factory;

import com.clc.learning.designpattern.factory.sample.methods.Sender;
import com.clc.learning.designpattern.factory.sample.methods.impl.MailSender;
import com.clc.learning.designpattern.factory.sample.methods.impl.SmsSender;

public class SenderFactory {
    public Sender produceMail(){
        return new MailSender();
    }
    public Sender produceSms(){
        return new SmsSender();
    }
}
