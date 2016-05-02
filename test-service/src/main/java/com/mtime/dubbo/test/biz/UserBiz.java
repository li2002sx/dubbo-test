package com.mtime.dubbo.test.biz;

import com.mtime.dubbo.test.dao.UserDao;
import com.mtime.dubbo.test.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jankie on 16/5/1.
 */
@Component
public class UserBiz {

    @Autowired
    UserDao userDao;

    public User getUserById (String userId) {
        return userDao.getUserById(userId);
    }
}
