package com.clc.learning.designpattern.factory.sample.normal.factory;

import com.clc.learning.designpattern.factory.sample.normal.Sender;
import com.clc.learning.designpattern.factory.sample.normal.impl.MailSender;
import com.clc.learning.designpattern.factory.sample.normal.impl.SmsSender;

public class SenderFactory {
    public final static String SENDER_TYPE_MAIL = "mail";
    public final static String SENDER_TYPE_SMS = "SMS";
    public Sender produce(String type) {
        switch (type) {
            case SENDER_TYPE_MAIL:
                return new MailSender();
            case SENDER_TYPE_SMS:
                return new SmsSender();
            default:
                return null;
        }
    }
}
