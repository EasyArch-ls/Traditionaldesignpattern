package observationpattern;

/***
 * @Author: lisheng
 * @Date: 2020/7/11
 * @Time: 下午3:25
 * @Description:
 ***/
public class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.addObserver(new ConcreteObserver("A", "抽烟", concreteSubject));
        concreteSubject.addObserver(new ConcreteObserver("B", "喝酒", concreteSubject));
        concreteSubject.addObserver(new ConcreteObserver("C", "烫头", concreteSubject));
        concreteSubject.setSubjectState("工作");
        concreteSubject.notice();

    }
}
