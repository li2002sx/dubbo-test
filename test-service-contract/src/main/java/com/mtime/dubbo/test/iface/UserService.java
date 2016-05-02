package com.mtime.dubbo.test.iface;

import com.mtime.dubbo.test.dto.User;

import java.util.List;

/**
 * Created by jankie on 16/5/1.
 */
public interface UserService {

    User getUserById (String userId);

    List<User> getUserList();
}
