package aop.proxy.jdk.dynamic;

/**
 * @description 测试类
 * @author Kangshuai Zuo
 * @date 2018/12/21 8:29
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy(subject);
        Subject realSubject = jdkDynamicProxy.getProxy();
        realSubject.doSomething();
        // 拒绝代理
        realSubject.doAnotherThing();
    }

}