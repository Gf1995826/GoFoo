package com.cienet.springboot.config;


import com.cienet.springboot.component.MyLanguageIntercepter;
import com.cienet.springboot.component.MyLocaleReolve;
import com.cienet.springboot.component.MyLoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMVCConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new MyLoginHandlerInterceptor()).
//                addPathPatterns("/**")
//                .excludePathPatterns("/", "/index.html", "/user/login", "/asserts/**", "/webjars/**");
//        registry.addInterceptor(new MyLanguageIntercepter()).addPathPatterns("/", "/index.html");
//    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleReolve();
    }

}
