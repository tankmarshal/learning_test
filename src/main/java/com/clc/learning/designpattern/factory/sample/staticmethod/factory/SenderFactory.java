package com.clc.learning.designpattern.factory.sample.staticmethod.factory;

import com.clc.learning.designpattern.factory.sample.staticmethod.Sender;
import com.clc.learning.designpattern.factory.sample.staticmethod.impl.MailSender;
import com.clc.learning.designpattern.factory.sample.staticmethod.impl.SmsSender;

public class SenderFactory {
    public static Sender produceMail(){
        return new MailSender();
    }
    public static Sender produceSms(){
        return new SmsSender();
    }
}
