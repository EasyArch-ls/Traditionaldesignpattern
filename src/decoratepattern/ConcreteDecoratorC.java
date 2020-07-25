package decoratepattern;

/***
 * @Author: lisheng
 * @Date: 2020/7/25
 * @Time: 下午2:30
 * @Description:
 ***/
public class ConcreteDecoratorC extends Decorator{
    public ConcreteDecoratorC(Component component) {
        super(component);
    }
    @Override
    public void opration() {
        C();
        super.opration();
    }

    public void C(){
        System.out.println("C");
    }
}
