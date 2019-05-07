package com.bdqn.entity;/**
 * @Auther: HelloWorld
 */

/**
 * @program: spring-project
 * @description: User实体类
 * @author: lth
 * @create: 2019-05-07 09:31
 **/
public class User {

    private Integer userId;
    private String name;

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
    }

    public User(Integer userId, String name) {
        this.userId = userId;
        this.name = name;
    }

   /* @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }*/
}