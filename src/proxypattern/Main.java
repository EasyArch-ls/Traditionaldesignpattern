package proxypattern;

import java.lang.reflect.Proxy;

/***
 * @Author: lisheng
 * @Date: 2020/7/25
 * @Time: 下午3:37
 * @Description:
 ***/
public class Main {
    public static void main(String[] args) {
        BuyHouse buyHouse=new BuyHouse() {
            @Override
            public void buy() {
                System.out.println("xxxx");
            }
        };
        ProxyPerson proxyPerson=new ProxyPerson(buyHouse);
        proxyPerson.buy();
        //动态代理
        BuyHouse proxyByPerson= (BuyHouse)Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),new Class[]{BuyHouse.class},new ProxyByHouseHandle(buyHouse));
        proxyByPerson.buy();
        //cglib
        CglibProxy cglibProxy=new CglibProxy();
        BuyHouseTest buyHousePersonProxy=(BuyHouseTest)cglibProxy.getInstance(new BuyHouseTest());
        buyHousePersonProxy.buy();

    }
}
