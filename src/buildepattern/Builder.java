package buildepattern;

/***
 * @Author: lisheng
 * @Date: 2020/7/11
 * @Time: 下午2:24
 * @Description:抽象建造类
 ***/
public abstract class Builder {

    /**
     * 加入产品B
     */
    public abstract void buildPartA();

    /**
     *加入产品B
     */
    public abstract void buildPartB();

    /**
     *列出所有产品
     */
    public abstract Product getResult();

}
