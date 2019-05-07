package com.bdqn.a;

import com.bdqn.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring-project
 * @description: User实体测试类
 * @author: lth
 * @create: 2019-05-07 09:30
 **/
public class CreateBeanTest {

    /**
     * 功能描述:
     *      静态工厂创建user对象
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 11:04
     */
    @Test
    public void createBeanOne(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/beanone.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
    /**
     * 功能描述:
     *      动态工厂创建user对象
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 11:10
     */
    @Test
    public void createBeanTwo(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/beantwo.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
    /**
     * 功能描述:
     *    默认构造方法创建
     * @param:
     * @return:
     * @auther: lth
     * @date: 2019/5/7 11:18
     */
    @Test
    public void createBeanThree(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/beanthree.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
