package com.bdqn.test;/**
 * @Auther: HelloWorld
 */

import com.bdqn.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring-project
 * @description: user测试类
 * @author: lth
 * @create: 2019-05-07 09:41
 **/
public class UserTest {

    @Test
    public void getUser(){
        User user = new User();
        System.out.println(user);
    }
    @Test
    public void getUserTest(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
}
