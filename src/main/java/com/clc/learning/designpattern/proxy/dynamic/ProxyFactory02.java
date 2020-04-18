package com.clc.learning.designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory02 implements InvocationHandler{
    private IUserDao target;

    public ProxyFactory02(IUserDao target){
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObj = args[0];
        beforeMethod(argObj);
        Object object = method.invoke(target,args);
        afterMethod(argObj);
        return object;
    }

    public Object bind(){
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    private void beforeMethod(Object o){
        System.out.println("before method");
    }

    private void afterMethod(Object o){
        System.out.println("after method");
    }
}
