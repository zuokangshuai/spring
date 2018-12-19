package ioc.reflectandfactory.test;

import ioc.reflectandfactory.core.Factory;
import ioc.reflectandfactory.core.FactoryImpl;
import ioc.reflectandfactory.core.People;

/**
 * @description 测试类
 * @author Kangshuai Zuo
 * @date 2018/12/19 16:44
 */
public class Test {

    public static void main(String[] args) {

        Factory factory = new FactoryImpl();

        People people = (People) factory.getInstance("ioc.reflectandfactory.core.Student");
        people.setName("学生");
        System.out.println(people.getName());
        people.walk();
    }



}