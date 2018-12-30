package com.itheima.mybatis.sqlsession.defaults;

import com.itheima.mybatis.cfg.Configuration;
import com.itheima.mybatis.sqlsession.SqlSession;
import com.itheima.mybatis.sqlsession.SqlSessionFactory;

import java.sql.Connection;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/30 15:02
 * @Description: SqlSessionFactory接口的实现类
 **/
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration cfg;
    private Connection conn;

    public DefaultSqlSessionFactory(Configuration cfg) {
        this.cfg = cfg;
    }

    /**
     * @param:
     * @return:
     * @author: 杨朝阳
     * @date: 2018/12/30 15:03
     * @Description: 用于打开一个新的SqlSession对象
     */
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg, conn);
    }
}
