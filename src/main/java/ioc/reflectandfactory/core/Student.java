package ioc.reflectandfactory.core;

/**
 * @description 学生
 * @author Kangshuai Zuo
 * @date 2018/12/19 16:39
 */
public class Student extends People{

    @Override
    public void walk() {
        System.out.println("学生步行出行");
    }
}