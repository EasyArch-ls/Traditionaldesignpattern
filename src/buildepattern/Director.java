package buildepattern;

/***
 * @Author: lisheng
 * @Date: 2020/7/11
 * @Time: 下午2:34
 * @Description:指挥类
 ***/
public class Director {

    /**
     * @param builder 建照类 保证建照顺序一致
     */
    public void Construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
