package com.mtime.dubbo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.velocity.VelocityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.view.velocity.VelocityLayoutViewResolver;

/**
 * Created by jankie on 16/5/1.
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo/dubbo-consumer.xml"}) //加入spring的bean的xml文件
public class WebBootstrap {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebBootstrap.class, args);
    }

    @Bean
    public VelocityLayoutViewResolver velocityViewResolver(VelocityProperties properties) {
        VelocityLayoutViewResolver resolver = new VelocityLayoutViewResolver();
        properties.applyToViewResolver(resolver);
        resolver.setLayoutUrl("layout/default.vm");
        return resolver;
    }
}
