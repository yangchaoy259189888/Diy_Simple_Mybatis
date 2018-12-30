package com.itheima.mybatis.sqlsession;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/30 15:03
 * @Description: TODO
 **/
public interface SqlSessionFactory {
    SqlSession openSession();
}
