package aop.proxy.jdk.dynamic;

/**
 * @author Kangshuai Zuo
 * @description 主题
 * @date 2018/12/21 8:18
 */
public interface Subject {

    /**
     * 做一件事
     */
    void doSomething();

    /**
     * 做另一件事
     */
    void doAnotherThing();
}