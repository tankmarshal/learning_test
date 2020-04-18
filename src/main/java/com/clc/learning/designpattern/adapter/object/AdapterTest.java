package com.clc.learning.designpattern.adapter.object;

public class AdapterTest {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Adapter(source);
        target.request();
    }
}
