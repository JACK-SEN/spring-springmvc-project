package com.bdqn.b;

import com.bdqn.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.Entity;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @program: spring-project
 * @description: 值注入测试类
 * @author: lth
 * @create: 2019-05-07 11:45
 **/
public class SetValueTest {

    /**
     * 功能描述:
     * set方式注入
     *
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 12:00
     */
    @Test
    public void testSetValue() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/value-set.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.getUserId() + " " + user.getName());
    }

    /**
     * 功能描述:
     * 构造方法注入
     *
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 12:08
     */
    @Test
    public void testConstruct() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/value-constructor.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.getUserId() + " " + user.getName());
    }

    /**
     * 功能描述:
     * spel表达式注入方式
     *
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 12:12
     */
    @Test
    public void testSpel() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/value-spel.xml");
        User user2 = (User) context.getBean("user2");
        System.out.println(user2.getUserId() + " " + user2.getName());
    }

    /**
     * 功能描述:
     * 数组注入
     *
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 13:50
     */
    @Test
    public void testArr() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/value-arr.xml");
        User userArr = (User) context.getBean("userArr2");
        for (Object str : userArr.getAddress()) {
            System.out.println(str);
        }
    }

    /**
     * 功能描述:
     * list注入
     *
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 16:02
     */
    @Test
    public void testValueList() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/value-list.xml");
        User user = (User) context.getBean("user");
        for (Object str : user.getParams()) {
            System.out.println(str);
        }
    }

    /**
     * 功能描述:
     * map注入
     *
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 16:14
     */
    @Test
    public void testMapList() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/value-map.xml");
        User user = (User) context.getBean("user");
        Map map = user.getMap();
        Set set = map.entrySet();
        for (Object obj : set) {
            System.out.println(obj);
        }
    }

    /**
     * 功能描述:
     * properties注入
     *
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 16:22
     */
    @Test
    public void testValueProperties() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/value-properties.xml");
        User user = (User) context.getBean("user");
        Properties properties = user.getProperties();
        //输出全部
        System.out.println(properties);
        //通过key  查找value
        System.out.println(properties.getProperty("user"));
    }
}
