package com.clc.learning.cglib;

public class HelloService {
    public HelloService(){
        System.out.println("hello service 构造方法");
    }

    public HelloService(String str){
        System.out.println("hello service 有参构造方法：参数："+str);
    }

    /*
     * 该方法不能被子类覆盖，cglib是无法代理final修饰的方法
     */
    final public String sayOthers(String name){
        System.out.println("HelloService:sayOthers>> "+name);
        return null;
    }
    public String sayHello(String name){
        System.out.println("HelloService:sayHello>>前后没有加aop "+name);
        return "";
    }
}
