package com.bdqn.factory;/**
 * @Auther: HelloWorld
 */

import com.bdqn.entity.User;

/**
 * @program: spring-project
 * @description: 静态工厂创建bean
 * @author: lth
 * @create: 2019-05-07 10:58
 **/
public class UserStaticFactory {

    public  static User getUserByStaticFactory(){
        System.out.println("静态工厂创建的user对象");
        return new User();
    }
}
