package com.mtime.dubbo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by jankie on 16/5/1.
 */
public class ServiceBootstrap {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        new String[]{"classpath:dubbo/dubbo-provider.xml",
                                "classpath:spring/spring-root.xml",
                                "classpath:spring/spring-mybatis.xml"});
        context.start();

        System.in.read();
        /*com.alibaba.dubbo.container.Main.main(args);*/
    }
}
