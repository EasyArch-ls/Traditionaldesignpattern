package proxypattern;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/***
 * @Author: lisheng
 * @Date: 2020/7/25
 * @Time: 下午3:48
 * @Description:
 ***/
public class CglibProxy implements MethodInterceptor {
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("买房前");
        //Object result=methodProxy.invoke(o,objects); //会造成栈溢出
        Object result=methodProxy.invokeSuper(o,objects);
        System.out.println("买房后");
        return result;
    }
}
