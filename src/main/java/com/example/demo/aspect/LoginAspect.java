package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: wzh
 * @ClassName: LoginAspect
 * @Description:
 * @Date: 2019/8/18 14:34
 */
@Component
@Aspect
public class LoginAspect {
    private static Logger logger = LoggerFactory.getLogger(LoginAspect.class);

    @Pointcut("execution(public * com.example.demo.controller..*.*(..)))")
    public void listLog() {

    }

    @Before("listLog()")
    public boolean before(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("方法名:"+methodName);
        if (methodName.equals("mes")){
            System.out.println("我进入登陆");
            return true;
        }else {
            System.out.println("没进入");
            return false;
        }

    }
}
