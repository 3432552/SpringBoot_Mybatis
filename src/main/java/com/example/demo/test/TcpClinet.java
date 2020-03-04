package com.example.demo.test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

/**
 * @Author: wzh
 * @ClassName: TcpClinet
 * @Description:   客户端
 * @Date: 2020/3/4 11:29
 */
public class TcpClinet {
    public static void main(String[] args) throws Exception {
        System.out.println("socket tcp客户端启动....");
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8080);
        //创建socket客户端
        Socket socket = new Socket();
        socket.connect(inetSocketAddress, 3000);
        OutputStream os = socket.getOutputStream();
        os.write("我是蚂蚁课堂忠实粉丝....".getBytes());
        os.flush();
        os.close();
        socket.close();
    }

}
