package com.clc.learning.designpattern.factory.method.factory;

import com.clc.learning.designpattern.factory.method.Provider;
import com.clc.learning.designpattern.factory.method.Sender;
import com.clc.learning.designpattern.factory.method.impl.MailSender;

public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
