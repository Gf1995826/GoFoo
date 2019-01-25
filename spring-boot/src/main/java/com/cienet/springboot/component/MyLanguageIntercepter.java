package com.cienet.springboot.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyLanguageIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String l = (String) request.getSession().getAttribute("l");
        if (l != null) {
            request.getRequestDispatcher("/index.html?l='"+l+"'").forward(request,response);
            return false;
        }
        return true;
    }
}
