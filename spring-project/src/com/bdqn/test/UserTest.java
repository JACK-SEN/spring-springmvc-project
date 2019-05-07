package com.bdqn.test;

import com.bdqn.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring-project
 * @description: user测试类
 * @author: lth
 * @create: 2019-05-07 09:41
 **/
public class UserTest {

    /**
     * 功能描述:
     *  使用spring之前创建对象方式一
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 10:09
     */
    @Test
    public void getUser(){
        User user = new User();
        System.out.println(user);
    }

    /**
     * 功能描述:
     *   使用spring创建对象
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 10:33
     */
    @Test
    public void getUserTest(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
    /**
     * 功能描述:
     *   测试Scope ：singleton(单实例)、prototype(多实例)
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 10:09
     */
    @Test
    public void testScope(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        User user1 = (User) applicationContext.getBean("user1");
        User user2 = (User) applicationContext.getBean("user1");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1 == user2);
    }
    /**
     * 功能描述:
     *   测试initMethod: (singleton和prototype时都会执行)initMethod在加载配置文件的时候就自动执行
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 10:38
     */
    @Test
    public void testInitMethod(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        User user1 = (User) ac.getBean("user1");
        System.out.println(user1);
    }
    /**
     * 功能描述:
     *      测试destoryMethod：(singleton会执行，prototype不会执行)desctory-method在调用close方法时才会执行
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 10:44
     */
    @Test
    public void testDestoryMethod(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        User user1 = (User) ac.getBean("user1");
        System.out.println(user1);
        ac.close();
    }
}
