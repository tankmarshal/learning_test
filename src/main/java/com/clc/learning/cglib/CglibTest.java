package com.clc.learning.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class CglibTest {
    public static void main(String[] args) {
        //System.setProperties(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloService.class);
        enhancer.setCallback(new MyMethodInterceptor());
//        HelloService proxy = (HelloService)enhancer.create();
        Class[] cls = {String.class};
        String arg[] = {"arg1"};
        HelloService proxy = (HelloService)enhancer.create(cls,arg);
        proxy.sayHello("myName");
        proxy.sayOthers("error");
    }
}
