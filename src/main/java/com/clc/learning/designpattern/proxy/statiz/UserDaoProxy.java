package com.clc.learning.designpattern.proxy.statiz;

public class UserDaoProxy implements IUserDao {
    private IUserDao target;

    public UserDaoProxy(IUserDao target){
       this.target = target;
    }

    @Override
    public void save() {
        System.out.println("代理对象执行之前");
        target.save();
        System.out.println("代理对象执行之后");
    }
}
