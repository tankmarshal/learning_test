package com.clc.learning.io.bio.test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class NIOTest     {
    int port = 4343;
    public void server(){
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(4,4,60L,
                TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        threadPool.execute(new Runnable() {
                               @Override
                               public void run() {
                                   try {
                                       Selector selector = Selector.open();
                                       ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
                                       serverSocketChannel.bind(new InetSocketAddress(InetAddress.getLocalHost(),port));
                                       serverSocketChannel.configureBlocking(false);
                                       serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
                                       while(true){
                                           selector.select();
                                           Set<SelectionKey> selectionKeys = selector.selectedKeys();
                                           Iterator<SelectionKey> iterator = selectionKeys.iterator();
                                           while (iterator.hasNext()){
                                               SelectionKey key = iterator.next();
                                               SocketChannel channel = ((ServerSocketChannel)key.channel()).accept();
                                               channel.write(Charset.defaultCharset().encode("hello,中国"));
                                               iterator.remove();
                                           }
                                       }
                                   } catch (IOException e) {
                                       e.printStackTrace();
                                   }
                               }
                           }

        );
    }

    public static void main(String[] args) {

    }
}
