package aop.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description Cglib动态代理
 * @author Kangshuai Zuo
 * @date 2018/12/21 8:48
 */
public class CglibProxy implements MethodInterceptor {

    private final String PROXY_METHOD = "doSomething";

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if(PROXY_METHOD.equals(method.getName())){
            System.out.println("Before:" + method);
            Object object = methodProxy.invokeSuper(o, objects);
            System.out.println("After:" + method);
            return object;
        }
        return null;
    }
}