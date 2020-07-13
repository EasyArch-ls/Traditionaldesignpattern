package buildepattern;

/***
 * @Author: lisheng
 * @Date: 2020/7/11
 * @Time: 下午2:31
 * @Description:具体建造类
 ***/
public class ConcreteBuildA extends Builder{
    private Product product = new Product();

    @Override
    public void buildPartA() {
      product.addPart("部件A");
    }

    @Override
    public void buildPartB() {
        product.addPart("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
