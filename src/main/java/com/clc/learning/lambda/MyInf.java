package com.clc.learning.lambda;

public interface MyInf {
    static void test(String name) {
        System.out.println(name);
    }

    default void test2(String name) {
        System.out.println(name);
    }

    void test3(String name);
}
