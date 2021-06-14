package com.ymr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author: YMR
 * @date: 2021-05-14 22:32
 **/
/*@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.ymr.mapper")*/
@SpringBootApplication//@SpringBootConfiguration+@EnableAutoConfiguration+@ComponentScan("com.ymr")主程序所在的包
@MapperScan(basePackages = "com.ymr.mapper")
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
