package com.clc.learning.threads.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();

        Callable ca1 = new Callable(){
            @Override
            public Object call() throws Exception {
                Thread.sleep(1000);
                return "1000 done";
            }
        };

        FutureTask<String> ft1 = new FutureTask<String>(ca1);
        new Thread(ft1).start();

        Callable ca2 = new Callable() {
            @Override
            public Object call() throws Exception {
                Thread.sleep(1000*3);
                return "3000 done";
            }
        };

        FutureTask<String> ft2 = new FutureTask<String>(ca2);
        new Thread(ft2).start();

        System.out.println(ft1.get());
        System.out.println(ft2.get());

        long end = System.currentTimeMillis();

        System.out.println("总共花了多少时间"+(end-start));

    }
}
