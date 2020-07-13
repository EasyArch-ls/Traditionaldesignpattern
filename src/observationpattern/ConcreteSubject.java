package observationpattern;

import java.awt.*;
import java.beans.EventHandler;

/***
 * @Author: lisheng
 * @Date: 2020/7/11
 * @Time: 下午3:09
 * @Description:具体通知者
 ***/
public class ConcreteSubject extends Subject {
    private String SubjectState;

    public String getSubjectState() {
        return SubjectState;
    }

    public void setSubjectState(String subjectState) {
        SubjectState = subjectState;
    }
}
