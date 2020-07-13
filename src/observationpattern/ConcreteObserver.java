package observationpattern;

import java.text.MessageFormat;

/***
 * @Author: lisheng
 * @Date: 2020/7/11
 * @Time: 下午3:14
 * @Description:
 ***/
public class ConcreteObserver extends Observer{
    private String name;
    private String observerStatus;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(String name, String observerStatus, ConcreteSubject concreteSubject) {
        this.name = name;
        this.observerStatus = observerStatus;
        this.concreteSubject = concreteSubject;
    }

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
        String newObserverStatus=concreteSubject.getSubjectState();
        System.out.println(MessageFormat.format(("{0}的状态从{1}变为{2}"),name,observerStatus,newObserverStatus));
    }
}
