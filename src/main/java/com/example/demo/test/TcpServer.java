package com.example.demo.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: wzh
 * @ClassName: TcpServer
 * @Description:  服务器端
 * @Date: 2020/3/4 11:42
 */
public class TcpServer {
    public static void main(String[] args) {
        System.out.println("服务器开始启动!");
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            //等待客户端连接阻塞状态
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            String result = new String(bytes, 0, len);
            System.out.println("收到的消息:" + result);
            is.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
