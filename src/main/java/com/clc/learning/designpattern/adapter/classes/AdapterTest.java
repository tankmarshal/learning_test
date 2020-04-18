package com.clc.learning.designpattern.adapter.classes;

public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.request();
    }
}
