package com.kly.ants.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/3/30 15:29
 */
public class Client {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext.getBean("petStore").hashCode());
        System.out.println(applicationContext.getBean("petStore").hashCode());
    }
}
