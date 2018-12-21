package aop.proxy.jdk.staticproxy;

/**
 * @author Kangshuai Zuo
 * @description 主题类
 * @date 2018/12/21 9:05
 */
public class RealSubject implements Subject{

    @Override
    public void doSomething() {
            System.out.println("做了一些事情");
    }
}