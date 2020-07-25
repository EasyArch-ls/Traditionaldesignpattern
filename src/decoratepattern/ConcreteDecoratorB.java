package decoratepattern;

/***
 * @Author: lisheng
 * @Date: 2020/7/25
 * @Time: 下午2:30
 * @Description:
 ***/
public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    @Override
    public void opration() {
        B();
        super.opration();
    }

    public void B(){
        System.out.println("B");
    }
}
