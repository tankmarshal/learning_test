package com.clc.learning.designpattern.proxy.statiz.impl;

import com.clc.learning.designpattern.proxy.statiz.IUserDao;

public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("save data");
    }
}
