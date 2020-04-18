package com.clc.learning.designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private IUserDao target;

    public ProxyFactory(IUserDao target){
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始目标方法之前");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("执行目标方法之后");
                        return returnValue;
                    }
                });
    }
}
