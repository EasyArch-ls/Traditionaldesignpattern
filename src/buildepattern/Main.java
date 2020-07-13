package buildepattern;

/***
 * @Author: lisheng
 * @Date: 2020/7/11
 * @Time: 下午2:37
 * @Description:*建造模式是在当创建复杂对象的算法应该独立与对象的组成部分以及它们的装配方法是适用的模式
 * 建造模式使建造代码与表示代码分离
 ***/
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builderA = new ConcreteBuildA();
        Builder builderB = new ConcreteBuildB();
        director.Construct(builderA);
        Product productA = builderA.getResult();
        productA.show();
        director.Construct(builderB);
        Product productB = builderB.getResult();
        productB.show();
    }
}
