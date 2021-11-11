package com.example.demospringboot.demointerceptor.interceptor;

import com.example.demospringboot.demointerceptor.exception.InvalidIdException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component
public class PersonInterceptor implements HandlerInterceptor {

    @SuppressWarnings("unchecked")
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws InvalidIdException {
        System.out.println("----------------- person interceptor preHandle --------------");

        Map<String, String> params = (Map<String, String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);

        String personId = params.get("personId");
        if (personId.length() > 3) {
            throw new InvalidIdException("Id " + personId + " is not valid.");
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        System.out.println("----------------- person interceptor postHandle --------------");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) {
        System.out.println("----------------- person interceptor afterCompletion --------------");
    }


}
