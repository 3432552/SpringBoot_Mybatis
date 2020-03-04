package com.example.demo.util;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: wzh
 * @ClassName: Test
 * @Description:
 * @Date: 2019/8/18 18:50
 */
public class Test implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
