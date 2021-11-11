package com.example.demospringboot.demointerceptor.config;

import com.example.demospringboot.demointerceptor.interceptor.MachineInterceptor;
import com.example.demospringboot.demointerceptor.interceptor.PersonInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
    @Autowired
    PersonInterceptor personInterceptor;

    @Autowired
    MachineInterceptor machineInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(personInterceptor).addPathPatterns("/person/*");
        registry.addInterceptor(machineInterceptor).addPathPatterns("/machine/*");
    }

}
