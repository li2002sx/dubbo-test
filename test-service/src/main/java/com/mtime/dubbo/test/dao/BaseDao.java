package com.mtime.dubbo.test.dao;

import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;

/**
 * Created by jankie on 16/5/1.
 */
public abstract class BaseDao {
    @Resource
    protected SqlSessionTemplate sqlSessionTemplate;
}