package decoratepattern;

/***
 * @Author: lisheng
 * @Date: 2020/7/25
 * @Time: 下午2:30
 * @Description:
 ***/
public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    @Override
    public void opration() {
        A();
        super.opration();
    }

    public void A(){
        System.out.println("A");
    }
    @Override
    public void Test(){
        System.out.println(22222);
    }
}
