package com.itheima.dao;

import com.itheima.domain.User;
import com.itheima.mybatis.annotations.Select;

import java.util.List;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/30 13:38
 * @Description: 用户的持久层接口
 **/
public interface IUserDao {

    /**
     * 查询所有操作
     *
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}
