package com.bdqn.entity;/**
 * @Auther: HelloWorld
 */

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @program: spring-project
 * @description: User实体类
 * @author: lth
 * @create: 2019-05-07 09:31
 **/
public class User {

    private Integer userId;
    private String name;

    private Object[] address;

    private List params;

    public List getParams() {
        return params;
    }

    private Map map;

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setParams(List params) {
        this.params = params;
    }

    public Object[] getAddress() {
        return address;
    }

    public void setAddress(Object[] address) {
        this.address = address;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
        System.out.println("默认构造方法执行了");
    }

    public User(Integer userId, String name) {
        this.userId = userId;
        this.name = name;
    }



    public  void initUser(){
        System.out.println("初始化user对象执行了");
    }
    public void destoryUser(){
        System.out.println("销毁user对象方法执行了");
    }
   /* @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }*/
}
