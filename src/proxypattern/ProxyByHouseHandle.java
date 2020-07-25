package proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/***
 * @Author: lisheng
 * @Date: 2020/7/25
 * @Time: 下午3:35
 * @Description:
 ***/
public class ProxyByHouseHandle implements InvocationHandler {
    private Object object;

    public ProxyByHouseHandle(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前");
        Object result=method.invoke(object,args);
        System.out.println("买房后");
        return result;
    }
}
