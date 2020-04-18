package com.clc.learning.designpattern.adapter.object;

public class Adapter implements Targetable {
    private Source source;

    public Adapter(Source source)
    {
        this.source = source;
    }
    @Override
    public void request() {
        source.method1();
        System.out.println("this is the targetable method!");
    }

}
