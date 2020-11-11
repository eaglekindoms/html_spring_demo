package com.learn.learnspring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MVCConfig implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("login");
        registry.addViewController("/signin").setViewName("login");
        registry.addViewController("/siginup").setViewName("siginup");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/404").setViewName("404");
        registry.addViewController("/500").setViewName("500");
        registry.addViewController("/basic-table").setViewName("basic-table");
        registry.addViewController("/blank").setViewName("blank");
        registry.addViewController("/buttons").setViewName("buttons");
        registry.addViewController("/calendar").setViewName("calendar");
        registry.addViewController("/charts").setViewName("charts");
        registry.addViewController("/chat").setViewName("chat");
        registry.addViewController("/compose").setViewName("compose");
        registry.addViewController("/datatable").setViewName("datatable");
        registry.addViewController("/email").setViewName("email");
        registry.addViewController("/forms").setViewName("forms");
        registry.addViewController("/google-maps").setViewName("google-maps");
        registry.addViewController("/ui").setViewName("ui");
        registry.addViewController("/vector-maps").setViewName("vector-maps");
    }

}