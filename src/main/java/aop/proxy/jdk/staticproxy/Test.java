package aop.proxy.jdk.staticproxy;

/**
 * @description 测试类
 * @author Kangshuai Zuo
 * @date 2018/12/21 9:11
 */
public class Test {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Subject proxySubject = new StaticProxy();
        ((StaticProxy) proxySubject).setSubject(realSubject);
        proxySubject.doSomething();
    }

}