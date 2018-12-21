package aop.proxy.jdk.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description JDK动态代理
 * @author Kangshuai Zuo
 * @date 2018/12/21 8:20
 */
public class JdkDynamicProxy implements InvocationHandler {

    /** 代理对象 */
    private Object object;

    private final String PROXY_METHOD = "doSomething";

    /**
     * 构造方法
     * @param object 被代理对象
     */
    public JdkDynamicProxy(Object object){
        this.object = object;
    }

    /**
     * 获取被代理对象
     * @param <T>  T
     * @return T
     */
    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(PROXY_METHOD.equals(method.getName())){
            System.out.println("我要宣布一件事");
            Object result = method.invoke(object, args);
            System.out.println("大家都知道了吧");
            return result;
        }else {
            return null;
        }

    }
}