package com.clc.learning.threads.threadpool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class NormalPool {
    public static void main(String[] args) {
        ThreadPoolExecutor tp = new ThreadPoolExecutor(10, 10, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        //tp.s
    }
}
