package com.clc.learning.designpattern.proxy.dynamic.impl;

import com.clc.learning.designpattern.proxy.dynamic.IUserDao;
import com.clc.learning.designpattern.proxy.dynamic.dto.User;

public class UserDao implements IUserDao {
    @Override
    public void save(User user) {
        System.out.println("save data");
    }
}
