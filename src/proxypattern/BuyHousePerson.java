package proxypattern;

/***
 * @Author: lisheng
 * @Date: 2020/7/25
 * @Time: 下午3:33
 * @Description:
 ***/
public class BuyHousePerson implements BuyHouse{
    @Override
    public void buy() {
        System.out.println("买房");
    }
}
