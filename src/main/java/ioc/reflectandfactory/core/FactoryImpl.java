package ioc.reflectandfactory.core;

/**
 * @description 工厂具体实现类
 * @author Kangshuai Zuo
 * @date 2018/12/19 16:32
 */
public class FactoryImpl implements Factory{


    @Override
    public Object getInstance(String className) {
        try {
            Class aClass = Class.forName(className);

            return aClass.newInstance();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }



}