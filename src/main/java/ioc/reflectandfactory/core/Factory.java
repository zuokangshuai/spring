package ioc.reflectandfactory.core;

/**
 * @author Kangshuai Zuo
 * @description 对象创建工厂接口
 * @date 2018/12/19 16:29
 */
public interface Factory {


    /**
     * 获取对象的方法
     * @param className 类名称
     * @return Object
     */
    Object getInstance(String className);

}