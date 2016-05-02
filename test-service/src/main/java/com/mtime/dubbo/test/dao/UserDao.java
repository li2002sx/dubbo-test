package com.mtime.dubbo.test.dao;

import com.mtime.dubbo.test.dto.User;
import org.springframework.stereotype.Repository;

/**
 * Created by jankie on 16/5/1.
 */
@Repository
public class UserDao extends BaseDao {

    public User getUserById (String userId){
        return sqlSessionTemplate.selectOne("user.getUserById", userId);
    }
}
