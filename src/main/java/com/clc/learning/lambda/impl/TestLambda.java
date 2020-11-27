package com.clc.learning.lambda.impl;

import java.util.ArrayList;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
//        MyInf myInf = name -> {
//            System.out.println(name);
//        };
//        myInf.test3("aaaa");
//
//        MyInf myInf2 = new MyInf(){
//            @Override
//            public void test3(String name) {
//                System.out.println(name);
//            }
//        };
//
//        MyInf myInf3 = new MyInf(){
//            @Override
//            public void test3(String name) {
//                System.out.println(name);
//            }
//        };


        TestLambda2 testLambda = new TestLambda2();
        testLambda.testLambda(name -> {
            System.out.println(name);
        });

        List a =  new ArrayList();
        a.isEmpty();
    }
}
