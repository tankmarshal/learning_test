package com.clc.learning.io.bio.test.nio2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class NIOClient {
    private Selector selector;

    /**
     * 获得一个Socket通道，并对该通道做一些初始化的工作
     * @param ip
     * @param port
     * @throws IOException
     */
    public void initClient(String ip,int port)throws IOException {
        //获取一个socket通道
        SocketChannel channel = SocketChannel.open();
        //设置通道为非阻塞
        channel.configureBlocking(false);
        //获取一个通道管理器
        this.selector = Selector.open();
        //客户端连接服务器，其实方法执行并没有实现连接，需要在listen()方法中调用
        //channel.finishConnect();才能完成连接
        channel.connect(new InetSocketAddress(ip,port));
        //将通道管理器和该通道绑定，并为该通道注册SelectionKey.OP_CONNECT事件
        channel.register(selector, SelectionKey.OP_CONNECT);
    }

    /**
     *
     * @throws IOException
     */
    public void liston()throws IOException{
        //轮询访问selector
        while (true){
            selector.select();
            //获取selector中选中的项的迭代器
            Iterator iterator = this.selector.selectedKeys().iterator();
            while(iterator.hasNext()){
                SelectionKey key = (SelectionKey) iterator.next();
                //删除已选的key，以防重复处理
                iterator.remove();
                //连接事件发生
                if(key.isConnectable()){
                    SocketChannel channel =(SocketChannel) key.channel();
                    //如果正在连接，则完成连接
                    if(channel.isConnectionPending()){
                        channel.finishConnect();
                    }
                    channel.configureBlocking(false);

                    //在这里可以给服务器端发送信息
                    channel.write(ByteBuffer.wrap(new String("向服务端发送一条消息").getBytes("UTF-8")));
                    //在和服务器连接成功之后，为了可以接收到服务器的信息，需要给通道设置读的权限
                    channel.register(this.selector,SelectionKey.OP_READ);

                }else if(key.isReadable()){
                    read(key);
                }
            }
        }
    }

    public void read(SelectionKey key) throws IOException{
        //服务器可读取消息，得到事件发生的socket通道
        SocketChannel channel = (SocketChannel)key.channel();
        //创建读取的缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(10);
        channel.read(buffer);
        byte[] data = buffer.array();
        String msg = new String(data).trim();
        System.out.println("客户端接收到的信息："+msg);
        ByteBuffer outBuffer = ByteBuffer.wrap(msg.getBytes("UTF-8"));
        channel.write(outBuffer);
    }

    public static void main(String[] args) throws IOException{
        NIOClient client = new NIOClient();
        client.initClient("localhost",9000);
        client.liston();
    }
}
