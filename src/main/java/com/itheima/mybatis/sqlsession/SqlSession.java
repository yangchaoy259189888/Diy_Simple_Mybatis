package com.itheima.mybatis.sqlsession;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/30 15:05
 * @Description: 自定义mybatis中和数据库交互的核心类
 * 可以创建dao接口的代理对象
 **/
public interface SqlSession {
    <T> T getMapper(Class daoInterfaceClass);
    void close();
}
