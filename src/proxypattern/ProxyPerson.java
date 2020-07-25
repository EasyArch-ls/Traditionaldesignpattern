package proxypattern;

/***
 * @Author: lisheng
 * @Date: 2020/7/25
 * @Time: 下午3:33
 * @Description:
 ***/
public class ProxyPerson implements BuyHouse {
    private BuyHouse buyHouse;

    public ProxyPerson(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buy() {
        System.out.println("买房前");
        buyHouse.buy();
        System.out.println("买房后");
    }
}
