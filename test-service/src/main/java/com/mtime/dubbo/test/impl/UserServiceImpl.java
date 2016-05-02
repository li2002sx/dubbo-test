package com.mtime.dubbo.test.impl;

import com.mtime.dubbo.test.biz.UserBiz;
import com.mtime.dubbo.test.dto.User;
import com.mtime.dubbo.test.iface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jankie on 16/5/1.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserBiz userBiz;

    public User getUserById (String userId){
        return userBiz.getUserById(userId);
    }

    public List<User> getUserList(){
        return null;
    }
}
