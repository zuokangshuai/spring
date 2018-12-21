package aop.proxy.jdk.dynamic;

/**
 * @description 真实主题
 * @author Kangshuai Zuo
 * @date 2018/12/21 8:19
 */
public class RealSubject implements Subject {

    @Override
    public void doSomething() {
        System.out.println("我可是真是主题");
    }

    @Override
    public void doAnotherThing() {
        System.out.println("emmmmmmmmmmmmmmmmmmm");
    }
}