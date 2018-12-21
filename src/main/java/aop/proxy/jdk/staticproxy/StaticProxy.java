package aop.proxy.jdk.staticproxy;

/**
 * @description 静态代理（proxy模式）
 * @author Kangshuai Zuo
 * @date 2018/12/21 9:06
 */
public class StaticProxy implements Subject {

    /** 被代理对象 */
    private Subject subject;

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doSomething() {
        System.out.println("做一些准备");
        subject.doSomething();
        System.out.println("没事了");
    }
}