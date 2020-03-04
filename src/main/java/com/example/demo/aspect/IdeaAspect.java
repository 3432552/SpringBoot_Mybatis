package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @Author: wzh
 * @ClassName: IdeaAspect
 * @Description:
 * @Date: 2019/8/18 13:56
 */
//@Component
//@Aspect
public class IdeaAspect {
    private static Logger logger=LoggerFactory.getLogger(IdeaAspect.class);
    @Pointcut("execution(public * com.example.demo.controller..*.*(..)))")
    public void listLog(){

    }
    @Before("listLog()")
    public void asList(){
        System.out.println("进入asList()了吗");
    }
    @After("listLog()")
    public void afterLog(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=attributes.getRequest();
        logger.info("request{} : " + request);
        logger.info("URL{} : " + request.getRequestURL());
        logger.info("method{} : " + request.getMethod());
        logger.info("IP{} : " + request.getRemoteAddr());
        logger.info("class_method={}:" + joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        logger.info("args{} : " + joinPoint.getArgs());
        Enumeration<String> enu = request.getParameterNames();
        //获取参数名和参数值
        while (enu.hasMoreElements()) {
            String name = (String) enu.nextElement();
            logger.info("name:{},value:{}", name, request.getParameter(name));
        }
    }
}
