package com.example.study.behavior_design_pattern.observer.generalObserver;


import java.util.ArrayList;
import java.util.List;

public class ObserverDemo {

    public static void main(String[] args) {
//        1：设置 发布者订阅者   模块方法  Observer SubjectEventBus
//        2：创建 发布者订阅者   实现类  ConcreteSubject  ConcreteObserver
//        3：订阅者 注册到发布者上 表示监听发布者
//        4：给发布者发送消息  然后监听该发布者的所有订阅者 都能收到

//        subject中直接add
        testObserverAdd();

//        先创建observe再add
        testObserverAll();

    }

    private static void testObserverAdd() {
        ConcretePublisher subject = new ConcretePublisher();

        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());

        ConcreteObserverRemove concreteObserverRemove = new ConcreteObserverRemove();
        subject.registerObserver(concreteObserverRemove);

        subject.removeObserver(concreteObserverRemove);

        subject.notifyObserversSuccess("ObserverAdd 成功了");
    }

    private static void testObserverAll() {
        ConcretePublisher subject = new ConcretePublisher();

        List<Observer> observers = new ArrayList<>();
        observers.add(new ConcreteObserverOne());
        observers.add(new ConcreteObserverTwo());

        ConcreteObserverRemove concreteObserverRemove = new ConcreteObserverRemove();
        observers.add(concreteObserverRemove);
        subject.registerAllObserver(observers);

        subject.removeObserver(concreteObserverRemove);

        subject.notifyObserversSuccess("ObserverAll  成功了");
    }
}