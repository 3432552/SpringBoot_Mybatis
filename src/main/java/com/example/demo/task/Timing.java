package com.example.demo.task;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: wzh
 * @ClassName: Timing
 * @Description:
 * @Date: 2019/10/31 16:59
 */
@Component
//@EnableScheduling
public class Timing {
    public static final SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a E");
    //每隔 3 秒执行一次
    @Scheduled(fixedRate = 3000)
    //cron表达式执行
    //@Scheduled(cron = "1-10 * * * * ? ")
    public void Time(){
        System.out.println("现在时间是："+sdf.format(new Date()));
    }
}
