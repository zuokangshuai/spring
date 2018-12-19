package ioc.reflectandfactory.core;

/**
 * @description 教师
 * @author Kangshuai Zuo
 * @date 2018/12/19 16:35
 */
public class Teacher extends People{

    @Override
    public void walk() {
        System.out.println("老师使用汽车出行");
    }
}