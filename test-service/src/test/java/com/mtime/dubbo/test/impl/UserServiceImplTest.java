package com.mtime.dubbo.test.impl;

import com.mtime.dubbo.test.dto.User;
import com.mtime.dubbo.test.iface.UserService;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jankie on 16/5/1.
 */
public class UserServiceImplTest extends AbstractTest {

    @Autowired
    UserService userService;

    public void setUp() throws Exception {
        super.setUp();
        userService = (UserService)context.getBean(UserService.class);
    }

    public void testGetUserById() throws Exception {
        User user = userService.getUserById("1");
        System.out.println(user.getEmail());
    }
}