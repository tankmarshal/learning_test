package com.clc.learning.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

public class CglibTest {
    public static void main(String[] args) {
        //System.setProperties(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloService.class);
        enhancer.setCallback(new MyMethodInterceptor());
        HelloService proxy = (HelloService)enhancer.create();
        proxy.sayHello("myname");
        proxy.sayOthers("error");
    }
}
