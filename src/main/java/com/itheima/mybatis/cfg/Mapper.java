package com.itheima.mybatis.cfg;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/30 15:26
 * @Description: 用于封装执行的SQL语句和结果类型的全限定类名
 **/
public class Mapper {
    //SQL
    private String queryString;
    //实体类的全限定类名
    private String resultType;

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
