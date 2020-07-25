package decoratepattern;

/***
 * @Author: lisheng
 * @Date: 2020/7/25
 * @Time: 下午1:50
 * @Description:装饰模式，动态的给一个对象添加一些额为的职责，就增加功能来说，装饰模式比生成子类更加灵活
 ***/
public class Main {
    public static void main(String[] args) {
        Component component=new ConcreteComponent();
        component=new ConcreteDecoratorC(new ConcreteDecoratorA(new ConcreteDecoratorB(component)));
        component.opration();

    }
}
