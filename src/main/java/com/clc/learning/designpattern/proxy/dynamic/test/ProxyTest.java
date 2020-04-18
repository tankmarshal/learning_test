package com.clc.learning.designpattern.proxy.dynamic.test;

import com.clc.learning.designpattern.proxy.dynamic.ProxyFactory;
import com.clc.learning.designpattern.proxy.dynamic.ProxyFactory02;
import com.clc.learning.designpattern.proxy.dynamic.dto.User;
import com.clc.learning.designpattern.proxy.dynamic.impl.UserDao;
import com.clc.learning.designpattern.proxy.dynamic.IUserDao;


public class ProxyTest {
    public static void main(String[] args) {
        User user = new User();
        IUserDao target = new UserDao();
        IUserDao userDao  = (IUserDao) new ProxyFactory(target).getProxyInstance();
        userDao.save(user);

        IUserDao userDao2  = (IUserDao) new ProxyFactory02(target).bind();
        userDao2.save(user);
    }

}
