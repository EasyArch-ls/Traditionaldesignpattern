package decoratepattern;

/***
 * @Author: lisheng
 * @Date: 2020/7/25
 * @Time: 下午2:26
 * @Description:
 ***/
public class Decorator implements Component{
   private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void opration() {
     component.opration();
    }

    public void Test(){
        System.out.println("111111");
    }
}
