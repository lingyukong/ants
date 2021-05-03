package com.kly.ants;

import com.kly.ants.web.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * 主程序类，这是一个springboot应用，也可以自定义类名，但是需要调用SpringApplication.run的方法
 */
@SpringBootApplication()
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("com.kly.other")
public class AntsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext cax = SpringApplication.run(AntsApplication.class, args);
        String[] names = cax.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        cax.getBean("HelloController", HelloController.class);
    }

}
