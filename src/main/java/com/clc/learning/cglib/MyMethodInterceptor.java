package com.clc.learning.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object sub, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("==========插入前置通知=======");
        Object object = methodProxy.invokeSuper(sub,objects);
        System.out.println("==========插入后置通知");
        return object;
    }
}
