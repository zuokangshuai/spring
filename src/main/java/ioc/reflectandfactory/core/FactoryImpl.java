package ioc.reflectandfactory.core;

import java.lang.reflect.Field;

/**
 * @description 工厂具体实现类
 * @author Kangshuai Zuo
 * @date 2018/12/19 16:32
 */
public class FactoryImpl implements Factory{


    @Override
    public Object getInstance(String className) {
        try {
            // 子类Class
            Class sonClass = Class.forName(className);
            // 父类Class
            Class parentClass = sonClass.getSuperclass();

            //  获取父类的私有字段
            Field[] parentField = parentClass.getDeclaredFields();
            for (Field f : parentField){
                System.out.println(f);
            }

            return sonClass.newInstance();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }



}