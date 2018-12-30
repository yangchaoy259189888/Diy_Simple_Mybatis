package com.itheima.mybatis.sqlsession;

import com.itheima.mybatis.cfg.Configuration;
import com.itheima.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.itheima.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/30 14:55
 * @Description: 用来创建一个SqlSessionFactory对象
 **/
public class SqlSessionFactoryBuilder {
    /**
     * @param: [config]
     * @return: com.itheima.mybatis.sqlsession.SqlSessionFactory
     * @author: 杨朝阳
     * @date: 2018/12/30 15:41
     * @Description: 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     */
    public SqlSessionFactory build(InputStream config) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);

        return new DefaultSqlSessionFactory(cfg);
    }
}
