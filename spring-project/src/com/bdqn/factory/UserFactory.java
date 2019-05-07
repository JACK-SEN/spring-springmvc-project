package com.bdqn.factory;/**
 * @Auther: HelloWorld
 */

import com.bdqn.entity.User;

/**
 * @program: spring-project
 * @description: 动态工厂创建user对象
 * @author: lth
 * @create: 2019-05-07 11:07
 **/
public class UserFactory {

    public User getUserByFactory(){
        System.out.println("动态工厂执行了");
        return new User();
    }
}
