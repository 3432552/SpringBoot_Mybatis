package com.example.demo.test;

import java.io.*;
import java.net.Socket;
import java.util.*;

/**
 * @Author: wzh
 * @ClassName: Test
 * @Description:
 * @Date: 2020/3/3 10:38
 */
public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "张三");
        map.put("2", "李四");
        map.put("3", "王五");
        for (String m:map.keySet()
             ) {
            System.out.println("编号:"+m+"\t"+"姓名:"+map.get(m));
        }
    }
}
