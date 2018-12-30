package com.itheima.mybatis.sqlsession.defaults;

import com.itheima.mybatis.cfg.Configuration;
import com.itheima.mybatis.sqlsession.SqlSession;
import com.itheima.mybatis.sqlsession.proxy.MapperProxy;
import com.itheima.mybatis.utils.DataSourceUtil;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/30 15:10
 * @Description: TODO
 **/
public class DefaultSqlSession implements SqlSession {
    private Configuration cfg;
    private Connection conn;

    public DefaultSqlSession(Configuration cfg, Connection conn) {
        this.cfg = cfg;
        this.conn = DataSourceUtil.getConnection(cfg);
    }

    /**
     * @param: [daoInterfaceClass] dao的接口字节码
     * @return: T
     * @author: 杨朝阳
     * @date: 2018/12/30 15:11
     * @Description: 用于创建代理对象
     */
    public <T> T getMapper(Class daoInterfaceClass) {
        return (T) Proxy.newProxyInstance(daoInterfaceClass.getClassLoader(),
                new Class[]{daoInterfaceClass},
                new MapperProxy(cfg.getMappers(), conn));
    }

    /**
     * @param: []
     * @return: void
     * @author: 杨朝阳
     * @date: 2018/12/30 15:33
     * @Description: 释放资源
     */
    public void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
