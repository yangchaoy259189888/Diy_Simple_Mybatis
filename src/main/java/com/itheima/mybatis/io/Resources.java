package com.itheima.mybatis.io;

import java.io.InputStream;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/30 14:53
 * @Description: 使用类加载器读取配置文件
 **/
public class Resources {
    /**
     * @param: [filePath]
     * @return: java.io.InputStream
     * @author: 杨朝阳
     * @date: 2018/12/30 14:54
     * @Description: 根据传入的参数filePath,获取一个字节输入流
     */
    public static InputStream getResourceAsStream(String filePath) {
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
