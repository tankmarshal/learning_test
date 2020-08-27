package com.clc.learning.sensitive.desensitization.bean;

import red.zyc.desensitization.Sensitive;

public class Test {
    public static void main(String[] args) {
        Child child = Sensitive.desensitize(new Child());
        System.out.printf(child.getEmail());
    }
}
