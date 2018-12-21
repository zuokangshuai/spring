package aop.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @description 测试类
 * @author Kangshuai Zuo
 * @date 2018/12/21 8:55
 */
public class Test {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new CglibProxy());
        RealSubject realSubject = (RealSubject) enhancer.create();
        realSubject.doSomething();
    }

}