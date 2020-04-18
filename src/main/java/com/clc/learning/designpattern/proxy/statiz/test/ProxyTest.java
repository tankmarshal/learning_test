package com.clc.learning.designpattern.proxy.statiz.test;

import com.clc.learning.designpattern.proxy.statiz.IUserDao;
import com.clc.learning.designpattern.proxy.statiz.UserDaoProxy;
import com.clc.learning.designpattern.proxy.statiz.impl.UserDao;

public class ProxyTest {
    public static void main(String[] args) {
        IUserDao target = new UserDao();
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();
    }

}
