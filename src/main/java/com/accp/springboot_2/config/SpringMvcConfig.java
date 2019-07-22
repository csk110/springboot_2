package com.accp.springboot_2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author ChenSK
 * @date 2019-07-21 - 16:32
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        System.out.println(123);
        registry.addViewController("/login").setViewName("login");
    }
}
