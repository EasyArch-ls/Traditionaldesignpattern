package decoratepattern;

/***
 * @Author: lisheng
 * @Date: 2020/7/25
 * @Time: 下午2:24
 * @Description:
 ***/
public class ConcreteComponent implements Component{
    @Override
    public void opration() {
        System.out.println(String.format("被修饰的对象: %s",this.getClass()));
    }
}
