package com.mtime.dubbo.test.impl;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jankie on 16/5/1.
 */
public class AbstractTest extends TestCase {

    protected ApplicationContext context;

    public void setUp() throws Exception {
        super.setUp();

        context = new ClassPathXmlApplicationContext(new String[]{
                "classpath:spring/spring-root.xml",
                "classpath:spring/spring-mybatis.xml"
        });
    }
}
